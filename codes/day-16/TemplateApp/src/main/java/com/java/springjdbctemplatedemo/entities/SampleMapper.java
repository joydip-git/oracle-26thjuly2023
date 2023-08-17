package com.java.springjdbctemplatedemo.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SampleMapper implements RowMapper<Sample> {

	public Sample mapRow(ResultSet rs, int rowNum) throws SQLException {
		Sample sample = new Sample();
		sample.setProductId(rs.getInt("product_id"));
		sample.setProducName(rs.getString("product_name"));
		sample.setProductImage("");
		return sample;
	}

}
