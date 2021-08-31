package com.technotech.dao;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.technotech.model.User;

public class DB {
	
	final String connectionUrl = "mongodb+srv://techGurlivleen:172105@technotechjavadbcluster.ezufc.mongodb.net/javamongodb?retryWrites=true&w=majority";
	
	MongoClient mongoClient;
	MongoDatabase database;
	
	public DB() {
		try {
			mongoClient = MongoClients.create(connectionUrl);
			database = mongoClient.getDatabase("javamongodb");
			
			System.out.println(">>> Connection Estabblished");
		} catch (Exception e) {
			System.err.println(">>> Something Went Wrong!! Please Try Again...");
		}
	}
	
	public boolean register(User user) {
		
		Document document = new Document(user.toMap());
		database.getCollection("users").insertOne(document);
		System.out.println(user.name + " Registered Successfully");
		
		return true;
	}
	
	public boolean login(User user) {
		return false;
	}
	
	public void fetchUsers() {
		
	}
	
	
}
