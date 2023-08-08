package com.java.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/*
 * interface Messenger{
 * 	public String getMessage(String name);
 * }
 * proxy (service descriptor) class
 * class MessengerService{
 * 	public Object getMessengerPort(){
 * 		
 *  }
 * }
 */
@WebService
//@SOAPBinding(style = Style.RPC)
@SOAPBinding(style = Style.DOCUMENT)
public class Messenger {
	public Messenger() {
		System.out.println("Messenger instance created");
	}

	@WebMethod
	public String getMessage(String name) {
		return "Welcome " + name;
	}
}
