package com.technotech.dao;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.util.buf.HexUtils;
import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.InsertOneResult;
import com.technotech.model.EXTRAS;
import com.technotech.model.User;

public class DB {
	
	// MongoDB Connection and Database
	MongoClient client;
	MongoDatabase database;
	
	// Password Encryption
	MessageDigest digest;
	
	public DB() {
		// TODO Auto-generated constructor stub
		try {
			client = MongoClients.create(EXTRAS.CONNECTION_URL);
			database = client.getDatabase(EXTRAS.DATABASE);
			
			digest = MessageDigest.getInstance("SHA-256");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(">>> Something Went Wrong while establishing connection database");
		}
	}
	
	public User userRegister(User user) {
		digest.update(user.password.getBytes());
		user.password = HexUtils.toHexString(digest.digest());
		
		Document document = new Document(user.toMap());
		InsertOneResult result = database.getCollection(EXTRAS.COLLECTION_USER).insertOne(document);
		if(result.wasAcknowledged()) {
			user._id = result.getInsertedId().toString();
			return user;
		}
		
		return null;
	}
	
	public User login(String email, String password) {
		digest.update(password.getBytes());
		password = HexUtils.toHexString(digest.digest());
		
		BasicDBObject query = new BasicDBObject();
		query.append("email", email);
		query.append("password", password);
		
		MongoCursor<Document> userCursor = database.getCollection(EXTRAS.COLLECTION_USER).find(query).iterator();
		
		if(userCursor.hasNext()) {
			System.out.println("[DB]: "+ userCursor.next());
			Map<String, Object> userMap = userCursor.next();
			User user = User.getUser(userMap);
			return user;
		} else {
			System.out.println("[DB]: No User");
		}
		
		return null;
	}
	
	public void closeConnection() {
		client.close();
	}
}
