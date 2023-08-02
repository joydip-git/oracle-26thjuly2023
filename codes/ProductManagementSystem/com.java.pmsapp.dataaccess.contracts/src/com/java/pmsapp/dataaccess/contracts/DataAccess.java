package com.java.pmsapp.dataaccess.contracts;

import java.util.List;

public interface DataAccess<T, TId> {
	List<T> fetchAll();

	T fetchById(TId id);

	Boolean insert(T data);

	Boolean delete(TId id);

	Boolean update(TId id, T data);
}
