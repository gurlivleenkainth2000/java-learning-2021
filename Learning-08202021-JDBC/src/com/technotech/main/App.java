package com.technotech.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.technotech.dao.DBOperations;
import com.technotech.model.Customer;

public class App {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateTime = formatter.format(date);
		
//		Customer customer1 = new Customer(1, "Jack Peterson", "9876543210", "jack@example.com", 32f, dateTime, "");
//		Customer customer1 = new Customer(1, "Robin", "98653214778", "robin@example.com", 75.8f, dateTime, "");
//		Customer customer1 = new Customer(2, "Robin Peter", "98653214778", "robin.peter@example.com", 72.4f, dateTime, dateTime);
		Customer customer1 = new Customer(0, "Fiona", "9856741238", "fionna@example.com", 18.4f, dateTime, "");
		System.out.println(customer1);
		
		DBOperations db = new DBOperations();
		db.createConnection();
//		db.createAndExecute(customer1);
//		db.updateAndExecute(customer1);
		db.deleteCustomer(3);
		
		db.getCustomers();
		db.closeConnection();
	}

}
