package com.technotech.main;

import com.technotech.model.Customer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customer1 = new Customer(1, "Jack Peterson", "9876543210", "jack@example.com", 32f, "10:00 am", "6:00 pm");
		
		System.out.println(customer1);
	}

}
