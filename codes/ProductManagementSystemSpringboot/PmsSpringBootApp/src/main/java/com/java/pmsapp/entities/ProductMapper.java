package com.java.pmsapp.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p = new Product();
		p.setProductId(rs.getInt("product_id"));
		p.setProductName(rs.getString("product_name"));
		p.setPrice(rs.getDouble("price"));
		p.setDescription(rs.getString("description"));
		p.setCategoryId(rs.getInt("category_id"));
		return p;
	}

}
