package com.java.pmsapp.businesslayer.implementations;

import java.util.List;

import com.java.pmsapp.applicationexceptions.BusinessComponentException;
import com.java.pmsapp.businesslayer.contracts.BusinessComponent;
import com.java.pmsapp.entities.Category;

public class CategoryBusinessComponent implements BusinessComponent<Category, Integer> {

	private BusinessComponent<Category, Integer> _categoryDao;

	public CategoryBusinessComponent() {
	}

	public CategoryBusinessComponent(BusinessComponent<Category, Integer> _categoryDao) {
		this._categoryDao = _categoryDao;
	}

	@Override
	public List<Category> getAll() throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getById(Integer id) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean add(Category data) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean remove(Integer id) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modify(Integer id, Category data) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

}
