package com.java.pmsapp.dataaccess.implementations;

import com.java.pmsapp.dataaccess.utility.DataAccessUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.java.pmsapp.dataaccess.contracts.DataAccess;
import com.java.pmsapp.entities.Product;
import com.java.pmsapp.applicationexceptions.DataAccessException;
import com.java.pmsapp.dataaccess.abstractions.*;

public class ProductDataAccess implements ProductDataAccessContract {

	public ProductDataAccess() {
	}
	
	@Override
	public List<Product> fetchAll() throws DataAccessException {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		List<Product> products = null;
		try {
			DataAccessUtility.regsiterDriver();
			connection = DataAccessUtility.createConnection();
			statement = DataAccessUtility.createJDBCStatement(connection);
			resultSet = statement
					.executeQuery("select product_id,product_name,price,description,category_id from products");
			products = new ArrayList<Product>();			
			while (resultSet.next()) {
				Product p = new Product();
				p.setProductId(resultSet.getInt("product_id"));
				p.setProductName(resultSet.getString("product_name"));
				p.setPrice(resultSet.getDouble("price"));
				p.setDescription(resultSet.getString("description"));
				p.setCategoryId(resultSet.getInt("category_id"));
				products.add(p);
			}
		} catch (SQLException e) {
			DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
			throw dataEx;
		} catch (ClassNotFoundException e) {
			DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
			throw dataEx;
		} catch (Exception e) {
			DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
			throw dataEx;
		} finally {
			try {
				DataAccessUtility.closeConnection(connection);
			} catch (SQLException e) {
				DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
				throw dataEx;
			}
		}
		return products;
	}

	@Override
	public Product fetchById(Integer id) throws DataAccessException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		Product product = null;
		try {
			DataAccessUtility.regsiterDriver();
			connection = DataAccessUtility.createConnection();
			statement = connection.prepareStatement(
					"select product_id,product_name,price,description,category_id from products where product_id=?");
			statement.setInt(1, id);

			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				product = new Product();
				product.setProductId(resultSet.getInt("product_id"));
				product.setProductName(resultSet.getString("product_name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setDescription(resultSet.getString("description"));
				product.setCategoryId(resultSet.getInt("category_id"));
			}
		} catch (SQLException e) {
			DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
			throw dataEx;
		} catch (ClassNotFoundException e) {
			DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
			throw dataEx;
		} catch (Exception e) {
			DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
			throw dataEx;
		} finally {
			try {
				DataAccessUtility.closeConnection(connection);
			} catch (SQLException e) {
				DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
				throw dataEx;
			}
		}
		return product;
	}

	@Override
	public Boolean insert(Product data) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Integer id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Integer id, Product data) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProductsByName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

}