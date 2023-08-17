package com.java.spingbootdemo.springbootrest.repository;

import com.java.spingbootdemo.springbootrest.entities.Product;
import com.java.spingbootdemo.springbootrest.entities.ProductMapper;
import com.java.spingbootdemo.springbootrest.repository.ProductRepositoryAbstraction;

import java.util.List;

//import java.sql.Connection;
//import java.sql.PreparedStatement;

import javax.sql.DataSource;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class ProductRepositoryImplementation implements ProductRepositoryAbstraction<Product, Integer> {

	private JdbcTemplate jdbcTemplate;
	// private DataSource dataSource;

	@Autowired
	public ProductRepositoryImplementation(DataSource dataSource) {
		// this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Product> fetchAll() throws Exception {
		try {
			return jdbcTemplate.query("select * from products", new ProductMapper());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Product fetchById(Integer id) throws Exception {
		try {
			return jdbcTemplate.queryForObject("select * from products where product_id=?",
					new Object[] { id.intValue() }, new ProductMapper());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	// @Override
	public Boolean insert(Product data) throws Exception {
		// Connection connection = null;
		// PreparedStatement statement = null;
		try {
			/*
			 * System.out.println(data); connection = dataSource.getConnection();
			 * System.out.println(connection); statement = connection.
			 * prepareStatement("insert into products(product_id,product_name,description,price,category_id) values (?,?,?,?,?)"
			 * ); statement.setInt(1, data.getProductId()); statement.setString(2,
			 * data.getProductName()); statement.setString(3, data.getDescription());
			 * statement.setDouble(4, data.getPrice()); statement.setInt(5,
			 * data.getCategoryId());
			 * 
			 * int res = statement.executeUpdate();
			 */

			int res = jdbcTemplate.update(
					"insert into products(product_id,product_name,description,price,category_id) values (?,?,?,?,?)",
					new Object[] { data.getProductId(), data.getProductName(), data.getDescription(), data.getPrice(),
							data.getCategoryId() });
			return res > 0;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		/*
		 * finally { if(connection !=null) connection.close(); }
		 */
	}

	public Boolean delete(Integer id) throws Exception {
		try {
			int res = jdbcTemplate.update("delete from products where product_id=?", new Object[] { id.intValue() });
			return res > 0;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public Boolean update(Integer id, Product data) throws Exception {
		try {
			int res = jdbcTemplate.update("update products set product_name=?, description=?, price=?, category_id=? where product_id=?", new Object[] { data.getProductName(), data.getDescription(), data.getPrice(),
					data.getCategoryId(), id.intValue() });
			return res > 0;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	public List<Product> searchRecordsByName(String productName) {
		return null;
	}

}
