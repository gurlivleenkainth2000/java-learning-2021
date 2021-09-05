package com.technotech.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Food {
	public String _id;
	public String name;
	public String description;
	public float rating;
	public double price;
	public ArrayList<String> tags;
	public Date date;
	
	public Food() { }

	public Food(String _id, String name, String description, float rating, double price, ArrayList<String> tags,
			Date date) {
		this._id = _id;
		this.name = name;
		this.description = description;
		this.rating = rating;
		this.price = price;
		this.tags = tags;
		this.date = date;
	}
	
	public Food getFood(Map<String, Object> json) {
		return new Food();
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}
	
	
}
