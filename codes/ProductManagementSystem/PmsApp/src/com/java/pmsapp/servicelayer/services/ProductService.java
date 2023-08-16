package com.java.pmsapp.servicelayer.services;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientBackgroundScheduler;

import com.java.pmsapp.businesslayer.abstractions.ProductBusinessComponentAbstraction;
import com.java.pmsapp.businesslayer.implementations.ProductBusinessComponent;
import com.java.pmsapp.container.Injector;
import com.java.pmsapp.dataaccess.abstractions.ProductDataAccessContract;
import com.java.pmsapp.dataaccess.implementations.ProductDataAccess;
import com.java.pmsapp.entities.Product;
import com.java.pmsapp.entities.Sample;
import com.java.pmsapp.servicelayer.entities.ServiceResponse;

@Path("/products")
public class ProductService {

	private Injector injector;
	private ProductDataAccessContract dao;
	private ProductBusinessComponentAbstraction bo;

	public ProductService() throws Exception {
		try {
			injector = Injector.getInjector();
			dao = injector.createInstance(ProductDataAccess.class);
			bo = injector.createInstance(ProductBusinessComponent.class, dao, ProductDataAccessContract.class);
		} catch (Exception e) {
			throw e;
		}
	}
	
	@POST
	@Path("/upload")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ServiceResponse<Sample> uploadData(Sample sample){
		try {
			System.out.println(sample.getProductImage());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Orcl2022");
			PreparedStatement statement = connection.prepareStatement("insert into sampletable values(?,?,?");
			statement.setInt(0, sample.getProductId());
			statement.setString(1, sample.getProductName());
			//statement.setBlob(1, );
			return new ServiceResponse<Sample>("ok", 200, sample);
		} catch (Exception e) {
			return new ServiceResponse<Sample>(e.getMessage(), 500, null);
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
	@Path("/sort/{choice}")
	@Produces(MediaType.APPLICATION_JSON)
	public ServiceResponse<List<Product>> retrieveAllSortedProducts(@PathParam("choice") int choice) {
		try {
			List<Product> list = bo.getAll(choice);
			return new ServiceResponse<List<Product>>("records found and sorted", 200, list);
		} catch (Exception e) {
			return new ServiceResponse<List<Product>>(e.getMessage(), 500, null);
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
			return new ServiceResponse<Product>(e.getMessage(), 500, null);
		}
	}
}
