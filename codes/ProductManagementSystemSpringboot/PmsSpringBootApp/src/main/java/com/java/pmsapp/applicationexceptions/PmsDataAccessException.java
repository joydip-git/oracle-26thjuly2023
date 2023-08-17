package com.java.pmsapp.applicationexceptions;

public class PmsDataAccessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PmsDataAccessException() {
		super("Error occurred");
	}
	public PmsDataAccessException(String message) {
		super(message);
	}
	public PmsDataAccessException(String message, Exception actual) {
		super(message, actual);
	}
}
