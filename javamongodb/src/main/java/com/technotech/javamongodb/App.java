package com.technotech.javamongodb;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCursor;
import com.technotech.model.Student;

public class App {
	
    public static void main(String[] args) {
        Student student = new Student("Robin", "robin@example.com", 22, "9874563217", "ABC Khanna", "Coffee Lover", true);
        
        System.out.println(student.toMap());
        
        String mongodbUrl = "mongodb+srv://techGurlivleen:172105@technotechjavadbcluster.ezufc.mongodb.net/javamongodb?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(mongodbUrl);
        
        System.out.println(">>> Mongo COnnection Created Successfully :)");
        
//      Adding Document to MongoDB
//        Document document = new Document(student.toMap());
//        mongoClient.getDatabase("javamongodb").getCollection("students").insertOne(document);
        
//        Fetching Documents from MongoDB
        MongoCursor<Document> cursor = mongoClient.getDatabase("javamongodb").getCollection("students").find().iterator();
        while (cursor.hasNext()) {
			System.out.println(cursor.next().toJson());
		}
    }
}
