package com.java.pmsapp.businesslayer.abstractions;

import java.util.List;

import com.java.pmsapp.applicationexceptions.BusinessComponentException;
import com.java.pmsapp.businesslayer.contracts.BusinessComponent;
import com.java.pmsapp.entities.Product;

public interface ProductBusinessComponentAbstraction extends BusinessComponent<Product, Integer> {
	List<Product> getProductsByName(String productName);

	List<Product> getAll(int choice) throws BusinessComponentException;
}
