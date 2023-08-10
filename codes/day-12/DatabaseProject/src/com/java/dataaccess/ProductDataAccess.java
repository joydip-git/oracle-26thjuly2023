package com.java.dataaccess;

import java.sql.*;

import com.java.entities.*;
import com.java.exceptions.DataAccessException;

public class ProductDataAccess {
	public Product fetchById(Integer id) throws DataAccessException {
		if (id > 0) {
			Connection connection = null;
			PreparedStatement statement = null;
			ResultSet resultSet = null;
			Product product = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Orcl2022");
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
					if (connection != null)
						connection.close();
				} catch (SQLException e) {
					DataAccessException dataEx = new DataAccessException(e.getMessage(), e);
					throw dataEx;
				}
			}
			return product;
		} else
			//return null;
			throw new DataAccessException("negative value not allowed");
	}
}
