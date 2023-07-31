package com.java.pmsapp.logging;

public class AppLogger {

	// eager instantiation
	// private static AppLogger logger = new AppLogger();
	/*
	 * public static AppLogger getLogger() { 
	 * 	return logger; 
	 * }
	 */
	
	
	private AppLogger() {

	}
	
	//lazy instantiation
	private static AppLogger logger;
	public static AppLogger getLogger() {
		if(logger == null)
			logger = new AppLogger();
		
		return logger;
	}

	public void LogError(String errorInfo) {
		// code to write the error info in some file
	}
}
