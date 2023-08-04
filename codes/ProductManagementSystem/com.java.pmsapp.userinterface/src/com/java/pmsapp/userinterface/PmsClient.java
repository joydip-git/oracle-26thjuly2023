package com.java.pmsapp.userinterface;

import java.util.List;

import com.java.pmsapp.applicationexceptions.DataAccessException;
import com.java.pmsapp.container.Injector;
import com.java.pmsapp.dataaccess.abstractions.ProductDataAccessContract;
import com.java.pmsapp.dataaccess.implementations.ProductDataAccess;
import com.java.pmsapp.entities.Product;

public class PmsClient {

	public static void main(String[] args) {
		try {

			Injector<ProductDataAccessContract, ProductDataAccess> injectorInstance = Injector.getInjector();
			Class<ProductDataAccess> dataAccessClsInfo = ProductDataAccess.class;
			ProductDataAccessContract dao = injectorInstance.createInstance(dataAccessClsInfo);
			if (dao != null) {
				// System.out.println(dao.getClass().getName());
				List<Product> products = dao.fetchAll();
				if (products.size() > 0)
					products.forEach((p) -> System.out.println(p));
				else
					System.out.println("no products found");
			} else {
				System.out.println("no dao instance created");
			}
		} catch (IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		} catch (DataAccessException e) {
			e.printStackTrace();
			// System.out.println(e.getCause());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
