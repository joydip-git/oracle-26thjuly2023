package com.java.interfacedemo.implementations;

import com.java.interfacedemo.contracts.IDataAccess;
import com.java.interfacedemo.contracts.IDataSaver;

public final class TextFileDataAccess implements IDataAccess, IDataSaver {

	String filePath;

	public TextFileDataAccess() {
		super();
	}

	public TextFileDataAccess(String filePath) {
		super();
		this.filePath = filePath;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String getData() {
		return "data from xml file";
	}

	@Override
	public void saveData() {
		System.out.println("saved XML data");
	}
}
