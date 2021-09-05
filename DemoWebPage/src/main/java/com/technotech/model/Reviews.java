package com.technotech.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Reviews {
	public String _id;
	public String userId;
	public String userName;
	public Date date;
	public float rating;
	public String review;
	public Integer type;
	
	public Reviews() { }

	public Reviews(String userId, String userName, Date date, float rating, String review, Integer type) {
		this.userId = userId;
		this.userName = userName;
		this.date = date;
		this.rating = rating;
		this.review = review;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Reviews [_id=" + _id + ", userId=" + userId + ", userName=" + userName + ", date=" + date + ", rating="
				+ rating + ", review=" + review + ", type=" + type + "]";
	}
	
	public Reviews getReview(Map<String, Object> json) {
		Reviews review = new Reviews();
		review._id = (String) json.get("_id");
		review.userId = (String) json.get("userId");
		review.userName = (String) json.get("userName");
		review.rating = (float) json.get("rating");
		review.review = (String) json.get("review");
		review.type = (Integer) json.get("type");
		review.date = (Date) json.get("date");
		return review;
	}
	
	public Map<String, Object> toMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("userId", userId);
		map.put("userName", userName);
		map.put("review", review);
		map.put("rating", rating);
		map.put("type", type);
		map.put("date", new Date());
		return map;
	}
	
}
