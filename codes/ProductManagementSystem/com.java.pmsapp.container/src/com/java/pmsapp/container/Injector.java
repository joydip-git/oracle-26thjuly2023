package com.java.pmsapp.container;

public class Injector {
	private static Injector _injector;

	private Injector() {
	}

	public static Injector getInjector() {
		if (_injector == null)
			_injector = new Injector();
		return _injector;
	}
	/*
	 * public ProductDataAccessContract instantiate() { return new
	 * ProductDataAccess(); }
	 */

	public Object instantiate() {
		return null;
	}
}
