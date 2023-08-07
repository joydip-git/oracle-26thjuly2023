package com.java.helloworldserviceapp.host;

import javax.xml.ws.Endpoint;

import com.java.helloworldserviceapp.services.HelloWorld;

public class ServiceListener {

	public static void main(String[] args) {
		HelloWorld helloWorldInstance = new HelloWorld();
		String bindingUri = "http://localhost:9898/hellows";
		Endpoint.publish(bindingUri, helloWorldInstance);
		System.out.println("Hello world service listener is running..");
		/*HelloWorld1 helloWorldInstance1 = new HelloWorld1();
		String bindingUri1 = "http://localhost:9898/hellows1";
		Endpoint.publish(bindingUri1, helloWorldInstance1);*/
	}

}
