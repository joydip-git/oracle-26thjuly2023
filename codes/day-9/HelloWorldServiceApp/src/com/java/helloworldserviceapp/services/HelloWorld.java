package com.java.helloworldserviceapp.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld {
	
	public HelloWorld() {
		System.out.println("Hello world service created in server");
	}
	
	@WebMethod
	public String greetings(String name) {
		return "Greetings: " + name;
	}
}
