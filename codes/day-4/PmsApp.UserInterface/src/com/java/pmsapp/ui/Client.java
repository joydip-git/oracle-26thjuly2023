package com.java.pmsapp.ui;
import com.java.pmsapp.entities.*;
import com.java.pmsapp.container.*;
//import com.java.pmsapp.dataaccess.contracts.*;
import com.java.pmsapp.dataaccess.contracts.DataAccessContract;

public class Client {

	public static void main(String[] args) {
		Product p = new Product(1,"dell xps",100000.00d, "new product from dell");
		System.out.println(p);
 
		Injector injector = Injector.instantiate();
		DataAccessContract<Product> productDao = injector.create();
		productDao.add(p);
	}

}
