package com.java.springjdbctemplatedemo.dataaccess;

import java.util.List;

import com.java.springjdbctemplatedemo.entities.Sample;

public interface DataAccess {
	public List<Sample> getRecords() throws Exception;

	public Sample getRecord(int id) throws Exception;

	public boolean add(Sample sample) throws Exception;
}
