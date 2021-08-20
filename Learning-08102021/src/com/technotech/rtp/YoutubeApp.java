package com.technotech.rtp;

//abstract class Notification {
//	abstract void onNotificationReceived(String message);
//}

interface Notification {
	void onNotificationReceived(String message);
}

class User implements Notification {
	String name;
	String email;
	
	User() {
	}

	User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}

	@Override
	public void onNotificationReceived(String message) {
		// TODO Auto-generated method stub
		System.out.println("==========================================");
		System.out.println("New Notification Received");
		System.out.println("For: " + name);
		System.out.println(message);
		System.out.println("==========================================");
	}
	
}

//class YoutubeChannel {
//	// HAS-A RelationShip
//	Notification notification;
//	
//	void subscribe(Notification notification) {
//		this.notification = notification;
//	}
//	
//	void newVideoUploaded(String videoName) {
//		notification.onNotificationReceived("New Video Uploaded \n" + videoName);
//	}
//	
//}

class YoutubeChannel {
	// HAS-A RelationShip
	static int index;
	Notification[] notifications;
	
	YoutubeChannel() {
		notifications = new Notification[5];
		// TODO Auto-generated constructor stub
	}
	
	void subscribe(Notification notification) {
		notifications[index] = notification;
		index++;
	}
	
	void newVideoUploaded(String videoName) {		
		for(Notification notification: notifications) {
			if(notification != null) {
				notification.onNotificationReceived("New Video Uploaded \n" + videoName);
			}
		}
	}
	
}

class YoutubeMember {
	
}

public class YoutubeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User john = new User("John Watson", "john@example.com");
		User fionna = new User("fionna", "fionna@example.com");
		User kim = new User("Kim", "kimn@example.com");
		User jack = new User("Jack Watson", "jack@example.com");
		
		YoutubeChannel channel = new YoutubeChannel();
		channel.subscribe(john);
		channel.subscribe(fionna);
		channel.subscribe(kim);
		channel.subscribe(jack);
		
		channel.newVideoUploaded("Java Run-Time Polymorphism");

	}

}
