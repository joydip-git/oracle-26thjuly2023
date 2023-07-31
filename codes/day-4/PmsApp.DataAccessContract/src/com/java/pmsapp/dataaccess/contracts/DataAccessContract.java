package com.java.pmsapp.dataaccess.contracts;

import java.util.List;

public interface DataAccessContract<T> {
	boolean add(T object);
	boolean modify(int id, T object);
	boolean delete(int id);
	List<T> getAll();
	T get(int id);
}
