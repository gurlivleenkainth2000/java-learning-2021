package com.technotech.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.technotech.model.Customer;

public class DBOperations {
	
	Connection connection;
	Statement statement;

	public DBOperations() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">>> Driver Loaded :)");
		} catch (Exception e) {
			System.out.println(">>> Something Went Wrong: ");
			e.printStackTrace();
		}
	}
	
	public void createConnection() {
		try {
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost/JDBC";
			
			connection = DriverManager.getConnection(url, user, password);
			System.out.println(">>> Connection Established :)");
		} catch (Exception e) {
			System.out.println(">>> Something Went Wrong: ");
		}
	}
	
	public void createAndExecute(Customer customer) {
		try {
			statement = connection.createStatement();
			
			
		} catch (Exception e) {
			
		}
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println(">>> Connection Closed :)");
		} catch (Exception e) {
			System.out.println(">>> Something Went Wrong: ");
		}
	}
}
