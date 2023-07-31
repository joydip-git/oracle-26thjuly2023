package com.java.pmsapp.container;
import com.java.pmsapp.entities.*;
import com.java.pmsapp.dataaccess.contracts.*;
import com.java.pmsapp.dataaccess.implementation.*;

public class Injector {
	
	static Injector injector;
	
	private Injector() {
		System.out.println("Injector created");
	}
	
	public static Injector instantiate() {
		if(injector == null) {
			injector = new Injector();
		}
		return injector;
	}

	public DataAccessContract<Product> create() {
		DataAccessContract<Product> dao = new ProductDataAccess();
		return dao;
	}
}
