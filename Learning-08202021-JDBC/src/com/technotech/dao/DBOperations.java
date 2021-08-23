package com.technotech.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.technotech.model.Customer;

// dao => Database Access Object

public class DBOperations {
	
	Connection connection;
	Statement statement;
	
	PreparedStatement preparedStatement;

	public DBOperations() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">>> Driver Loaded :)");
		} catch (Exception e) {
			System.out.println(">>> Something Went Wrong :( ");
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
			System.out.println(">>> Something Went Wrong :( ");
		}
	}
	
	public void createAndExecute(Customer customer) {
		try {
//			String sql = "insert into Customer values(null, '"+customer.name+"', '"+customer.phone+"', '"+customer.email+"', "+customer.temperature+", '"+customer.inTime+"', '"+customer.outTime+"')";
			// executeUpdate() -> insert, update and delete in DataBase
			// executeQuery() -> select data from DataBase
			
			String sql = "insert into Customer values(null, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setString(3, customer.email);
			preparedStatement.setFloat(4, customer.temperature);
			preparedStatement.setString(5, customer.inTime);
			preparedStatement.setString(6, customer.outTime);
			
			int id = preparedStatement.executeUpdate();
			System.out.println("4.2 "+customer.name+" inserted");
			
		} catch (Exception e) {
			System.out.println(">>> Something Went Wrong :( ");
			e.printStackTrace();
		}
	}
	
	public void updateAndExecute(Customer customer) {
		try {
			
			String sql = "update Customer set name=?, phone=?, email=?, outTime=? where id=?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, customer.name);
			preparedStatement.setString(2, customer.phone);
			preparedStatement.setString(3, customer.email);
			preparedStatement.setString(4, customer.outTime);
			preparedStatement.setInt(5, customer.id);
			
			
			int rows = preparedStatement.executeUpdate();
			if(rows > 0) {
				System.out.println("4.2 "+customer.name+" updated");
			} else {
				System.out.println(">>> Something Went Wrong :( ");
				System.out.println(rows);
			}
			
		} catch (Exception e) {
			System.out.println(">>> Something Went Wrong :( ");
			e.printStackTrace();
		}
	}
	
	public void deleteCustomer(int id) {
		try {
			
			String sql = "delete from customer where id= " + id;
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.execute();
			
		} catch (Exception e) {
			System.out.println(">>> Something Went Wrong :( ");
			e.printStackTrace();
		}
	}
	
	public void getCustomers() {
		try {
			String sql = "select * from Customer";
			
			preparedStatement = connection.prepareStatement(sql);
			ResultSet result = preparedStatement.executeQuery();
			
			while (result.next()) {
				System.out.print("Id: " + result.getInt("id"));
				System.out.print(" Name: " + result.getString("name"));
				System.out.print(" Phone: " + result.getString("phone"));
				System.out.print(" Email: " + result.getString("Email"));
				System.out.print(" Temperature: " + result.getFloat("temperature"));
				System.out.print(" In-Time: " + result.getString("inTime"));
				System.out.println(" Out-Time: " + result.getString("outTime"));
			}
			
		} catch (Exception e) {	
			System.out.println(">>> Something Went Wrong :( ");			
		}
	}
	
	public void closeConnection() {
		try {
			connection.close();
			System.out.println(">>> Connection Closed :)");
		} catch (Exception e) {
			System.out.println(">>> Something Went Wrong :( ");
		}
	}
}
