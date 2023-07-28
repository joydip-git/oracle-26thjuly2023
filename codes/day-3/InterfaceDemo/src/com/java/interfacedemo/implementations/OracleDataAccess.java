package com.java.interfacedemo.implementations;

import com.java.interfacedemo.abstracts.DataAccess;
import com.java.interfacedemo.contracts.IDataSaver;

public final class OracleDataAccess extends DataAccess implements IDataSaver{
	
	public OracleDataAccess() {
	}

	public OracleDataAccess(String databaseConnectionString) {
		super(databaseConnectionString);
	}


	@Override
	public void saveData() {
		System.out.println("oracle data saved");		
	}

	@Override
	public String getData() {
		return "data from oracle";
	}

}
