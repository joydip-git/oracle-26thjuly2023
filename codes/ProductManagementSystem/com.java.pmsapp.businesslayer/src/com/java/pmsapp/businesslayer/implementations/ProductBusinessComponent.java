package com.java.pmsapp.businesslayer.implementations;

import java.util.List;

import com.java.pmsapp.dataaccess.abstractions.ProductDataAccessContract;
import com.java.pmsapp.applicationexceptions.BusinessComponentException;
import com.java.pmsapp.businesslayer.abstractions.ProductBusinessComponentAbstraction;
import com.java.pmsapp.entities.Product;

public class ProductBusinessComponent implements ProductBusinessComponentAbstraction {

	private ProductDataAccessContract productDao;

	public ProductBusinessComponent() {

	}

/*	public ProductBusinessComponent(ProductDataAccess _productDao) {
		this.productDao = _productDao;
	}*/
	public ProductBusinessComponent(ProductDataAccessContract _productDao) {
		this.productDao = _productDao;
	}

	@Override
	public List<Product> getAll() throws BusinessComponentException {
		return null;
	}

	@Override
	public List<Product> getAll(int choice) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Product getById(Integer id) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean add(Product data) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean remove(Integer id) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modify(Integer id, Product data) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}	
}
