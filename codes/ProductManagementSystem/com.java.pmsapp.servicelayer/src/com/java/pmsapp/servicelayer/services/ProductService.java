package com.java.pmsapp.servicelayer.services;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.pmsapp.businesslayer.abstractions.ProductBusinessComponentAbstraction;
import com.java.pmsapp.businesslayer.implementations.ProductBusinessComponent;
import com.java.pmsapp.container.Injector;
import com.java.pmsapp.dataaccess.abstractions.ProductDataAccessContract;
import com.java.pmsapp.dataaccess.implementations.ProductDataAccess;
import com.java.pmsapp.entities.Product;
import com.java.pmsapp.servicelayer.entities.ServiceResponse;

@Path("/products")
public class ProductService {

	private static Injector<ProductDataAccessContract, ProductDataAccess> daoInjectorInstance;
	private static Injector<ProductBusinessComponentAbstraction, ProductBusinessComponent> boInjectorInstance;
	private static ProductDataAccessContract dao;
	private static ProductBusinessComponentAbstraction bo;
	/*
	 * static { try { daoInjectorInstance = Injector.getInjector(); dao =
	 * (ProductDataAccessContract)
	 * daoInjectorInstance.createInstance(ProductDataAccess.class);
	 * 
	 * boInjectorInstance = Injector.getInjector(); bo =
	 * (ProductBusinessComponentAbstraction)
	 * boInjectorInstance.createInstance(ProductBusinessComponent.class, dao,
	 * ProductDataAccessContract.class); } catch (InstantiationException |
	 * IllegalAccessException | IllegalArgumentException | InvocationTargetException
	 * | NoSuchMethodException | SecurityException e) { e.printStackTrace(); } }
	 */

	public ProductService() throws Exception {
		try {
			daoInjectorInstance = Injector.getInjector();
			dao = (ProductDataAccessContract) daoInjectorInstance.createInstance(ProductDataAccess.class);

			boInjectorInstance = Injector.getInjector();
			bo = (ProductBusinessComponentAbstraction) boInjectorInstance.createInstance(ProductBusinessComponent.class,
					dao, ProductDataAccessContract.class);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			throw e;
		}
	}

	@GET
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	public ServiceResponse<List<Product>> retrieveAllProducts() {
		try {
			List<Product> list = bo.getAll();
			return new ServiceResponse<List<Product>>("records found", 200, list);
		} catch (Exception e) {
			return new ServiceResponse<List<Product>>(e.getMessage(), 200, null);
		}
	}

	@GET
	@Path("/{choice}")
	@Produces(MediaType.APPLICATION_JSON)
	public ServiceResponse<List<Product>> retrieveAllSortedProducts(@PathParam("choice") int choice) {
		try {
			List<Product> list = bo.getAll(choice);
			return new ServiceResponse<List<Product>>("records found and sorted", 200, list);
		} catch (Exception e) {
			return new ServiceResponse<List<Product>>(e.getMessage(), 200, null);
		}
	}

	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ServiceResponse<Product> retrieveProductById(@PathParam("id") int id) throws Exception {
		try {
			Product p = bo.getById(id);
			return new ServiceResponse<Product>("record found", 200, p);
		} catch (Exception e) {
			return new ServiceResponse<Product>(e.getMessage(), 200, null);
		}
	}
}
