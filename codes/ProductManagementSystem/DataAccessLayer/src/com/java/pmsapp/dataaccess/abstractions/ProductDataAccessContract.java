package com.java.pmsapp.dataaccess.abstractions;
import java.util.List;

import com.java.pmsapp.dataaccess.contracts.DataAccess;
import com.java.pmsapp.entities.Product;

public interface ProductDataAccessContract extends DataAccess<Product, Integer>{

	List<Product> searchProductsByName(String productName);
}
