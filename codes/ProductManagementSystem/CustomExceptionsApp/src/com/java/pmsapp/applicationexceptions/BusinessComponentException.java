package com.java.pmsapp.applicationexceptions;

public class BusinessComponentException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BusinessComponentException() {
		super("Error occurred");
	}
	public BusinessComponentException(String message) {
		super(message);
	}
	public BusinessComponentException(String message, Exception actual) {
		super(message, actual);
	}
}
