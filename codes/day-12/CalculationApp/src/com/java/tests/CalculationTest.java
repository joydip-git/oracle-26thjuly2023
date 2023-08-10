package com.java.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.java.calculation.implementation.Calculation;

public class CalculationTest {

	private Calculation calc;

	@Before
	public void setUp() {
		System.out.println("before very test case");
		calc = new Calculation();
	}

	@After
	public void tearDown() {
		System.out.println("after very test case");
		calc = null;
	}

	@Test
	public void multiplyPositiveTest() throws Exception {
		// Calculation calc = new Calculation();

		int result = calc.multiply(12, 3);
		Assert.assertEquals(36, result);
	}

	/*
	 * @Test public void multiplyExceptionTest() { //Calculation calc = new
	 * Calculation(); try { calc.multiply(-2, -3); } catch (Exception e) {
	 * Assert.assertEquals("values can't be less than zero", e.getMessage()); } }
	 */
	@Test(expected = ArithmeticException.class)
	public void multiplyExceptionTest() {
		calc.multiply(-2, -3);
	}
}
