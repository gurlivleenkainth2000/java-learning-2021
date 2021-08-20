package com.technotech.model;

public class Customer {
	
	public int id;
	public String name;
	public String phone;
	public String email;
	public float temperature;
	public String inTime;
	public String outTime;

	public Customer() {
	}

	public Customer(int id, String name, String phone, String email, float temperature, String inTime, String outTime) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.temperature = temperature;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", temperature="
				+ temperature + ", inTime=" + inTime + ", outTime=" + outTime + "]";
	}
}
