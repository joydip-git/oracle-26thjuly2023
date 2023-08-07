package com.java.clientapp.ui;

import com.java.clientapp.servicedescription.HelloWorld;
import com.java.clientapp.servicedescription.HelloWorldService;

public class App {

	public static void main(String[] args) {
		// creating object of communication class
		// it will help you to communicate with the actual remote class listener
		// in the server
		try {
			HelloWorldService service = new HelloWorldService();
			HelloWorld helloWorld = service.getHelloWorldPort();
			String helloWorldResponse = helloWorld.greetings("Joydip");
			System.out.println(helloWorldResponse);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
