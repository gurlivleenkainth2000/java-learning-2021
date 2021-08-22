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
		
		Customer customer1 = new Customer(1, "Jack Peterson", "9876543210", "jack@example.com", 32f, dateTime, "");
		System.out.println(customer1);
		
		DBOperations db = new DBOperations();
		db.createConnection();
	}

}
