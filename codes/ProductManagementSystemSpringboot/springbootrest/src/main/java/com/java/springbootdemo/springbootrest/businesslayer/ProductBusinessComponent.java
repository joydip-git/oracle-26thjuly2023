package com.java.springbootdemo.springbootrest.businesslayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.spingbootdemo.springbootrest.entities.Product;
import com.java.spingbootdemo.springbootrest.repository.ProductRepositoryAbstraction;
//import com.java.spingbootdemo.springbootrest.repository.ProductRepositoryImplementation;

@Component
public class ProductBusinessComponent implements BusinessComponent<Product, Integer> {

	@Autowired
	ProductRepositoryAbstraction<Product, Integer> productDao;
	// ProductRepositoryImplementation productDao;

	// private ProductRepositoryAbstraction<Product, Integer> productDao;

	/*
	 * @Autowired public
	 * ProductBusinessComponent(ProductRepositoryAbstraction<Product, Integer>
	 * productDao) {
	 * 
	 * this.productDao = productDao; }
	 */

	public List<Product> getAll() throws Exception {
		return productDao.fetchAll();
	}

	public Product getById(Integer id) throws Exception {
		return productDao.fetchById(id.intValue());
	}

	public Boolean add(Product data) throws Exception {
		return productDao.insert(data);
	}

	public Boolean remove(Integer id) throws Exception {
		return productDao.delete(id.intValue());
	}

	public Boolean modify(Integer id, Product data) throws Exception {
		return productDao.update(id, data);
	}

}
