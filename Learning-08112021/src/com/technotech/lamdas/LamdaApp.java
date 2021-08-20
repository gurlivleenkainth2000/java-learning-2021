package com.technotech.lamdas;

@FunctionalInterface
interface MessageReceiver {
	void onMessageReceived(String message);
}

@FunctionalInterface
interface CheckStringEquality {
	boolean checkString(String str1, String str2);
}

//class WhatsAppGroup implements MessageReceiver {
//
//	@Override
//	public void onMessageReceived(String message) {
//		// TODO Auto-generated method stub
//		System.out.println("Messgae Reciever");
//		System.out.println(message);
//	}
//	
//}

public class LamdaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MessageReceiver wAppGroupRef = new WhatsAppGroup();
//		wAppGroupRef.onMessageReceived("Messgae from Dev John");
		
//		MessageReceiver messageReceiver = new MessageReceiver() {
//			
//			@Override
//			public void onMessageReceived(String message) {
//				// TODO Auto-generated method stub
//				System.out.println("Messgae Reciever using Anonymous Class");
//				System.out.println(message);
//			}
//		};
//		messageReceiver.onMessageReceived("Hello...");
		
//		MessageReceiver receiver = (message) -> {
//			System.out.println("Messgae Reciever using Lambda Expression");
//			System.out.println(message);
//		};
//		receiver.onMessageReceived("Hello...");
		
		CheckStringEquality strRef = (str1, str2) -> {
//			if(str1.equals(str2)) {
//				System.out.println("Strings are equal");
//				return true;
//			} else {
//				System.out.println("Strings are not equal");
//				return false;
//			}
			
			return str1.equals(str2);
		};
		
		boolean result = strRef.checkString("Hello", "HeLLo");
		System.out.println("Given String Equal or Not: " + result);
	}

}
