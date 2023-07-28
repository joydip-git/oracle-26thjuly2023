package com.java.abstractdemo.entities;

public class MongoDbDataAccess extends DataAccess{
	public MongoDbDataAccess() {}
	public MongoDbDataAccess(String path) {
		super(path);
	}
	
	@Override
	public String getData() {
		//code
		return "data from mongodb";
	}
}
