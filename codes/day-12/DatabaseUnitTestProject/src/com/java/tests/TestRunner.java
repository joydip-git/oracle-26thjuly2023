package com.java.tests;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(ProductDataAccessUnitTests.class);
		List<Failure> failures = result.getFailures();
		if (failures.size() > 0) {
			for (Failure failedTest : failures) {
				System.out.println(failedTest.getMessage());
				System.out.println(failedTest.getTrace());
			}
		} else {
			System.out.println("all tests passed properly");
		}
	}
}
