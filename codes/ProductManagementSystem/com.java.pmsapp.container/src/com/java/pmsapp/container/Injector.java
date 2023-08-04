package com.java.pmsapp.container;

public class Injector<TContract, TImplementation extends TContract> {
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

	// public <TContract, TImplementation extends TContract> TContract
	// createInstance(Class<TImplementation> classInfo)
	public TContract createInstance(Class<TImplementation> classInfo)
			throws InstantiationException, IllegalAccessException {
		TImplementation classInstance = classInfo.newInstance();
		return classInstance;
	}
}
