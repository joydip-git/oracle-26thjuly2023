package com.java.listener;

//import java.util.Scanner;

import javax.xml.ws.Endpoint;

import com.java.services.Messenger;

public class ServiceListener {

	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		// define an endpoint for the service
		Endpoint.publish("http://localhost:3456/ws/messenger", messenger);
		System.out.println("service listener started...");
		System.out.println("press any key to terminate...");
		/*
		 * Scanner sc = new Scanner(System.in); sc.next();
		 */
	}
}
