package com.java.pmsapp.userinterface;

import java.util.List;

import com.java.pmsapp.applicationexceptions.DataAccessException;
import com.java.pmsapp.businesslayer.abstractions.ProductBusinessComponentAbstraction;
import com.java.pmsapp.businesslayer.implementations.ProductBusinessComponent;
import com.java.pmsapp.container.Injector;
import com.java.pmsapp.dataaccess.abstractions.ProductDataAccessContract;
import com.java.pmsapp.dataaccess.implementations.ProductDataAccess;
import com.java.pmsapp.entities.Product;

public class PmsClient {

	public static void main(String[] args) {
		try {

			Injector<ProductDataAccessContract, ProductDataAccess> daoInjectorInstance = Injector.getInjector();
			ProductDataAccessContract dao = (ProductDataAccessContract) daoInjectorInstance
					.createInstance(ProductDataAccess.class);

			Injector<ProductBusinessComponentAbstraction, ProductBusinessComponent> boInjectorInstance = Injector
					.getInjector();
			ProductBusinessComponentAbstraction bo = (ProductBusinessComponentAbstraction) boInjectorInstance
					.createInstance(ProductBusinessComponent.class, dao, ProductDataAccessContract.class);

			if (bo != null) {
				// System.out.println(dao.getClass().getName());
				List<Product> products = bo.getAll();

				if (products != null) {
					if (products.size() > 0)
						products.forEach((p) -> System.out.println(p));
					else
						System.out.println("no products found");
				} else
					System.out.println("products null");
			} else {
				System.out.println("no bo instance created");
			}
		} catch (IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
