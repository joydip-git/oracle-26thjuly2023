package com.java.pmsapp.dataaccess.contracts;

import java.util.List;

import com.java.pmsapp.applicationexceptions.DataAccessException;

public interface DataAccess<T, TId> {
	List<T> fetchAll() throws DataAccessException;

	T fetchById(TId id) throws DataAccessException;

	Boolean insert(T data) throws DataAccessException;

	Boolean delete(TId id) throws DataAccessException;

	Boolean update(TId id, T data) throws DataAccessException;
}
