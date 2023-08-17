package com.java.spingdemo.SpringApp;

public class ProductBusinessComponent implements BusinessComponent{
	private DataAccess dao;

	public ProductBusinessComponent(DataAccess dao) {
		this.dao = dao;
	}

	public String fetchData() {
		return dao.getData();
	}
}
