package com.java.pmsapp.applicationexceptions;

public class PmsBusinessComponentException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PmsBusinessComponentException() {
		super("Error occurred");
	}
	public PmsBusinessComponentException(String message) {
		super(message);
	}
	public PmsBusinessComponentException(String message, Exception actual) {
		super(message, actual);
	}
}

