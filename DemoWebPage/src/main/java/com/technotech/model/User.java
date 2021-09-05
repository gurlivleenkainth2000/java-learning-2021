package com.technotech.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class User {
	public String _id;
	public String name;
	public String email;
	public String mobile;
	public String gender;
	public String bio;
	public String username;
	public Date registeredOn;
	public String password;
	
	public User() {	}
	
	public User(String name, String email, String mobile, String gender, String bio, String username) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.bio = bio;
		this.username = username;
	}
	

	public User(String _id, String name, String email, String mobile, String gender, String bio, String username,
			Date registeredOn) {
		this._id = _id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.gender = gender;
		this.bio = bio;
		this.username = username;
		this.registeredOn = registeredOn;
	}

	@Override
	public String toString() {
		return "User [_id=" + _id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender=" + gender
				+ ", bio=" + bio + ", username=" + username + ", registeredOn=" + registeredOn + ", password="
				+ password + "]";
	}
	
	public static User getUser(Map<String, Object> json) {
		User user = new User();
		user._id = (String) json.get("_id").toString();
		user.name = (String) json.get("name");
		user.email = (String) json.get("email");
		user.mobile = (String) json.get("mobile");
		user.gender = (String) json.get("gender");
		user.bio = (String) json.get("bio");
		user.username = (String) json.get("username");
		user.registeredOn = (Date) json.get("registeredOn");
		user.password = (String) json.get("password");

		return user;
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("email", email);
		map.put("mobile", mobile);
		map.put("gender", gender);
		map.put("bio", bio);
		map.put("username", username);
		map.put("registeredOn", new Date());
		map.put("password", password);
		return map;
	}
	
	
}
