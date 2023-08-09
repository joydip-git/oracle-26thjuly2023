package com.java.pmsapp.businesslayer.implementations;

import java.util.Comparator;
import java.util.List;

import com.java.pmsapp.dataaccess.abstractions.ProductDataAccessContract;
import com.java.pmsapp.applicationexceptions.BusinessComponentException;
import com.java.pmsapp.applicationexceptions.DataAccessException;
import com.java.pmsapp.businesslayer.abstractions.ProductBusinessComponentAbstraction;
import com.java.pmsapp.entities.Product;

public class ProductBusinessComponent implements ProductBusinessComponentAbstraction {

	private ProductDataAccessContract productDao;

	public ProductBusinessComponent() {

	}

	/*
	 * public ProductBusinessComponent(ProductDataAccess _productDao) {
	 * this.productDao = _productDao; }
	 */
	public ProductBusinessComponent(ProductDataAccessContract _productDao) {
		this.productDao = _productDao;
	}

	@Override
	public List<Product> getAll() throws BusinessComponentException {
		try {
			List<Product> list = this.productDao.fetchAll();
			if (list == null) {
				throw new BusinessComponentException("something went wrong...try later");
			} else if (list.size() == 0) {
				throw new BusinessComponentException("no records found");
			} else {
				return list;
			}
		} catch (DataAccessException ex) {
			throw new BusinessComponentException(ex.getMessage(), ex);
		} catch (BusinessComponentException ex) {
			throw ex;
		} catch (Exception e) {
			throw new BusinessComponentException(e.getMessage(), e);
		}
	}

	@Override
	public List<Product> getAll(int choice) throws BusinessComponentException {
		try {
			List<Product> list = this.productDao.fetchAll();
			if (list == null) {
				throw new BusinessComponentException("something went wrong...try later");
			} else if (list.size() == 0) {
				throw new BusinessComponentException("no records found");
			} else {
				Comparator<Product> compLogic = null;
				switch (choice) {
				case 1:
					compLogic = (p1, p2) -> p1.getProductId() - p2.getProductId();
					break;

				case 2:
					compLogic = (p1, p2) -> p1.getProductName().compareTo(p2.getProductName());
					break;

				case 3:
					compLogic = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());
					break;

				default:
					compLogic = (p1, p2) -> p1.getProductId() - p2.getProductId();
					break;
				}
				list.sort(compLogic);
				return list;
			}

		} catch (DataAccessException ex) {
			throw new BusinessComponentException(ex.getMessage(), ex);
		} catch (BusinessComponentException ex) {
			throw ex;
		} catch (Exception e) {
			throw new BusinessComponentException(e.getMessage(), e);
		}
	}

	@Override
	public Product getById(Integer id) throws BusinessComponentException {
		try {
			Product p = this.productDao.fetchById(id);
			if (p == null)
				throw new BusinessComponentException("no such product found");
			else
				return p;
		} catch (DataAccessException ex) {
			throw new BusinessComponentException(ex.getMessage(), ex);
		} catch (BusinessComponentException ex) {
			throw ex;
		} catch (Exception e) {
			throw new BusinessComponentException(e.getMessage(), e);
		}
	}

	@Override
	public Boolean add(Product data) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean remove(Integer id) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean modify(Integer id, Product data) throws BusinessComponentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductsByName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}
}
