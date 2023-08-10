package com.java.pmsapp.businesslayer.contracts;

import java.util.List;

import com.java.pmsapp.applicationexceptions.BusinessComponentException;

public interface BusinessComponent<T,TId> {
	List<T> getAll() throws BusinessComponentException;

	T getById(TId id) throws BusinessComponentException;

	Boolean add(T data) throws BusinessComponentException;

	Boolean remove(TId id) throws BusinessComponentException;

	Boolean modify(TId id, T data) throws BusinessComponentException;
}
