package com.java.springjdbcdemo.dataaccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.java.springjdbcdemo.entities.Sample;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SampleDataAccess implements DataAccess {

	private DataSource dataSource;

	public SampleDataAccess() {
		// TODO Auto-generated constructor stub
	}

	public SampleDataAccess(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Sample> getRecords() throws Exception {
		String query = "select * from sampletable";
		Connection con = null;
		Statement statement = null;
		ResultSet set = null;
		List<Sample> list = null;
		try {
			con = dataSource.getConnection();
			statement = con.createStatement();
			set = statement.executeQuery(query);
			list = new ArrayList<Sample>();
			while (set.next()) {
				Sample sample = new Sample();
				sample.setProductId(set.getInt("product_id"));
				sample.setProducName(set.getString("product_name"));
				list.add(sample);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			if (con != null)
				con.close();
		}
		return list;
	}

}
