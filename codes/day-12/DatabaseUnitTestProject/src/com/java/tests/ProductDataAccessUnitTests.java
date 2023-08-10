package com.java.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.java.dataaccess.*;
import com.java.entities.*;
import com.java.exceptions.*;

//@RunWith(Parameterized.class)
public class ProductDataAccessUnitTests {

	private static ProductDataAccess dao;
	// private Integer inputId;

	/*
	 * public ProductDataAccessUnitTests(Integer id) { inputId = id; }
	 */
	@BeforeClass
	public static void initialize() {
		dao = new ProductDataAccess();
	}
	
	@AfterClass
	public static void cleanUp() {		
		dao = null;
	}

	@Before
	public void setUp() {
		//dao = new ProductDataAccess();
	}

	@After
	public void tearDown() {
		//dao = null;
	}

	@Test
	// @Ignore
	public void fetchByIdPositiveTest() {
		try {
			// Product actualProduct = dao.fetchById(inputId);
			Product actualProduct = dao.fetchById(1);
			Product expectedProduct = new Product(1, "the alchemist", "book by paul cohelo", 399.74d, null, 1);
			Assert.assertEquals(expectedProduct, actualProduct);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	@Test
	@Ignore
	public void fetchByIdNegativeTest() {
		try {
			Product actualProduct = dao.fetchById(-1);
			Product expectedProduct = null;
			Assert.assertEquals(expectedProduct, actualProduct);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	// @Test(expected = DataAccessException.class)
	@Ignore
	@Test
	public void fetchByIdExceptionTest() {
		try {
			dao.fetchById(-1);
		} catch (DataAccessException e) {
			Assert.assertEquals("negative value not allowed", e.getMessage());
		}
	}
}
