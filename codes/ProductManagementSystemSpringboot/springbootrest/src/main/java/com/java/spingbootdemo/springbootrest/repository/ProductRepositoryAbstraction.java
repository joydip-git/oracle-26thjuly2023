package com.java.spingbootdemo.springbootrest.repository;

import java.util.List;

public interface ProductRepositoryAbstraction<T, TId> {
	List<T> fetchAll() throws Exception;

	T fetchById(TId id) throws Exception;

	Boolean insert(T data) throws Exception;

	Boolean delete(TId id) throws Exception;

	Boolean update(TId id, T data) throws Exception;

	List<T> searchRecordsByName(String productName);
}