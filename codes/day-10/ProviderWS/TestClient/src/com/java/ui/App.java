package com.java.ui;

import java.rmi.RemoteException;

import com.java.services.MessengerProxy;

public class App {

	public static void main(String[] args) throws RemoteException {
		MessengerProxy proxy = new MessengerProxy();
		System.out.println(proxy.getMessage("joydip"));
	}

}
