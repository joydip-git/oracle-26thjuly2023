package com.java.spingbootdemo.springbootrest.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spingbootdemo.springbootrest.entities.Product;
import com.java.spingbootdemo.springbootrest.repository.ProductRepositoryImplementation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest/products")
public class ProductController {

	@Autowired
	ProductRepositoryImplementation dao;

	@GetMapping("/get/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") int id) {
		try {
			Product p = dao.fetchById(id);
			return new ResponseEntity<Product>(p, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Product>> getProducts() {
		try {
			List<Product> p = dao.fetchAll();
			if (p != null && p.size() > 0)
				return new ResponseEntity<List<Product>>(p, HttpStatus.OK);
			else
				return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		try {
			Boolean status = dao.delete(id);
			return status ? new ResponseEntity<String>("product with id#" + id + " deleted successfully", HttpStatus.OK)
					: new ResponseEntity<String>("product with id#" + id + " was not deleted",
							HttpStatus.EXPECTATION_FAILED);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Product p) {
		try {
			boolean status = dao.insert(p);
			if (status) {
				return new ResponseEntity<String>("Product was saved successfully", HttpStatus.CREATED);
			} else {
				return new ResponseEntity<String>("Product was not saved successfully", HttpStatus.EXPECTATION_FAILED);
			}
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
		}
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateProduct(@RequestBody Product p, @PathVariable("id") int id) {
		try {
			boolean status = dao.update(id, p);
			if (status) {
				return new ResponseEntity<String>("Product was updated successfully", HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("Product was not updated successfully",
						HttpStatus.EXPECTATION_FAILED);
			}
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
		}
	}
}
