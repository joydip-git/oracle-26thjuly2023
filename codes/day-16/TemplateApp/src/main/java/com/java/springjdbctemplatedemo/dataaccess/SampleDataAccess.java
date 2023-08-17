package com.java.springjdbctemplatedemo.dataaccess;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.java.springjdbctemplatedemo.entities.Sample;
import com.java.springjdbctemplatedemo.entities.SampleMapper;

@Component
public class SampleDataAccess implements DataAccess {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public SampleDataAccess(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Sample> getRecords() throws Exception {
		try {
			String query = "select product_id, product_name from sampletable";
			return jdbcTemplate.query(query, new SampleMapper());
		} catch (Exception e) {
			throw e;
		}
	}

	public boolean add(Sample sample) throws Exception {
		try {
			String query = "insert into sampletable(product_id,product_name) values(?,?)";
			Object[] parameters = new Object[] { sample.getProductId(), sample.getProducName() };
			int res = jdbcTemplate.update(query, parameters);
			return res > 0 ? true : false;
		} catch (Exception e) {
			throw e;
		}
	}

	public Sample getRecord(int id) throws Exception {
		try {
			String query = "select product_id, product_name from sampletable where product_id=?";
			return jdbcTemplate.queryForObject(query, new Object[] { id }, new SampleMapper());
		} catch (Exception e) {
			throw e;
		}
	}

}
