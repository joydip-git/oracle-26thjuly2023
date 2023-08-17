package com.java.pmsapp.dataaccess.implementations;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.java.pmsapp.entities.Product;
import com.java.pmsapp.entities.ProductMapper;
import com.java.pmsapp.dataaccess.abstractions.*;

@Repository
public class ProductDataAccess implements ProductDataAccessContract {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public ProductDataAccess(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("DAO created");
	}

	public List<Product> fetchAll() throws DataAccessException {
		try {
			String query = "select product_id,product_name,price,description,category_id from products";
			return jdbcTemplate.query(query, new ProductMapper());
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public Product fetchById(Integer id) throws DataAccessException {
		try {
			String query = "select product_id,product_name,price,description,category_id from products where product_id=?";
			return jdbcTemplate.queryForObject(query, new ProductMapper());
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public Boolean insert(Product data) throws DataAccessException {
		try {
			String query = "insert into products(product_id,product_name,price,description,category_id) values(?,?,?,?,?)";
			int status = jdbcTemplate.update(query, new Object[] { data.getProductId(), data.getProductName(),
					data.getPrice(), data.getDescription(), data.getCategoryId().intValue() });
			return status > 0;
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public Boolean delete(Integer id) throws DataAccessException {
		try {
			String query = "delete from products where product_id=?";
			int status = jdbcTemplate.update(query, new Object[] { id.intValue() });
			return status > 0;
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public Boolean update(Integer id, Product data) throws DataAccessException {
		try {
			String query = "update products set product_name=?,price=?,description=?,category_id=? where product_id=?";
			int status = jdbcTemplate.update(query, new Object[] { data.getProductName(), data.getPrice(),
					data.getDescription(), data.getCategoryId().intValue(), id.intValue() });
			return status > 0;
		} catch (DataAccessException e) {
			throw e;
		}
	}

	public List<Product> searchProductsByName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}
}