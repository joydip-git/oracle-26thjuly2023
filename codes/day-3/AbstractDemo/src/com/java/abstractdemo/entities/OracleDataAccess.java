package com.java.abstractdemo.entities;

public class OracleDataAccess extends DataAccess{
	
	public OracleDataAccess() {}
	public OracleDataAccess(String path) {
		super(path);
	}
	
	@Override
	public String getData() {
		//code
		return "data from oracle";
	}
}
