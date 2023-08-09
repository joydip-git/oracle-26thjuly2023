package com.java.ui;

import java.util.Scanner;

import com.java.servicedescription.Messenger;
import com.java.servicedescription.MessengerService;

public class Client {

	public static void main(String[] args) {
		System.out.println("client app running");
		System.out.println("client app wants to interact with the service");
		MessengerService messengerClient = new MessengerService();
		Messenger messengerProxy = messengerClient.getMessengerPort();
		String message = messengerProxy.getWelcomeMessage("joydip");
		System.out.println(message);
		
		System.out.println("press any key to terminate client...");
		Scanner sc = new Scanner(System.in);
		sc.next();
	}

}
