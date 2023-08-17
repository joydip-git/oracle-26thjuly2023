package com.java.springjdbcdemo.dataaccess;

import java.util.List;

import com.java.springjdbcdemo.entities.Sample;

public interface DataAccess {
	public List<Sample> getRecords() throws Exception;
}
