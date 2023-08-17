package com.java.pmsapp.servicelayer.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.pmsapp.dataaccess.abstractions.ProductDataAccessContract;
import com.java.pmsapp.entities.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/products")
public class ProductController {

	private ProductDataAccessContract dao;

	@Autowired
	public ProductController(ProductDataAccessContract dao) {
		this.dao = dao;
		System.out.println("controller created");
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Product>> getAllProducts() {
		System.out.println("get all");
		try {
			List<Product> list = dao.fetchAll();
			return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
		try {
			Product p = dao.fetchById(id);
			return new ResponseEntity<Product>(p, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<String> addProduct(@RequestBody Product p) {
		try {
			Boolean status = dao.insert(p);
			ResponseEntity<String> resp = null;
			if (status.booleanValue()) {
				resp = new ResponseEntity<String>("record added", HttpStatus.CREATED);
			} else {
				resp = new ResponseEntity<String>("could not add", HttpStatus.EXPECTATION_FAILED);
			}
			return resp;
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateProduct(@PathVariable("id") int id, @RequestBody Product p) {
		try {
			Boolean status = dao.update(id, p);
			ResponseEntity<String> resp = null;
			if (status.booleanValue()) {
				resp = new ResponseEntity<String>("record updated", HttpStatus.CREATED);
			} else {
				resp = new ResponseEntity<String>("could not update", HttpStatus.EXPECTATION_FAILED);
			}
			return resp;
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		try {
			Boolean status = dao.delete(id);
			ResponseEntity<String> resp = null;
			if (status.booleanValue()) {
				resp = new ResponseEntity<String>("record deleted", HttpStatus.CREATED);
			} else {
				resp = new ResponseEntity<String>("could not delete", HttpStatus.EXPECTATION_FAILED);
			}
			return resp;
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
