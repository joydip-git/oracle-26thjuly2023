package com.java.springbootdemo.springbootrest.businesslayer;

import java.util.List;

public interface BusinessComponent<T,TId> {
	List<T> getAll() throws Exception;

	T getById(TId id) throws Exception;

	Boolean add(T data) throws Exception;

	Boolean remove(TId id) throws Exception;

	Boolean modify(TId id, T data) throws Exception;
}

