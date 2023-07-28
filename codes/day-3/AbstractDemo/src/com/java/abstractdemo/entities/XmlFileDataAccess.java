package com.java.abstractdemo.entities;

//if you do not want this class to be derived any further
//public final class XmlFileDataAccess extends DataAccess
public class XmlFileDataAccess extends DataAccess {
	public XmlFileDataAccess() {
	}

	public XmlFileDataAccess(String path) {
		super(path);
	}

	@Override
	// public final String getData() => if you do not want this method to be
	//overriden in further child classes of this class
	//final keyword can be used with ONLY overriden methods, NOT with every method
	public String getData() {
		// code
		return "data from xml file";
	}
}
