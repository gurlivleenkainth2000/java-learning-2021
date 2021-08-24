package com.technotech.model;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	String name;
	String email;
	int age;
	String mobile;
	String address;
	String tagLine;
	boolean student;
	
	public Student() {
	}

	public Student(String name, String email, int age, String mobile, String address, String tagLine, boolean student) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
		this.tagLine = tagLine;
		this.student = student;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", age=" + age + ", mobile=" + mobile + ", address="
				+ address + ", tagLine=" + tagLine + ", student=" + student + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("email", email);
		map.put("age", age);
		map.put("mobile", mobile);
		map.put("address", address);
		map.put("tagLine", tagLine);
		map.put("student", student);
		return map;
	}
	
	
}
