package com.technotech.model;

import java.util.HashMap;
import java.util.Map;

public class User {
	
	public String name;
	public String email;
	public String password;
	
	public User() { }

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [user=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("email", email);
		map.put("password", password);
		return map;
	}
	
	
}
