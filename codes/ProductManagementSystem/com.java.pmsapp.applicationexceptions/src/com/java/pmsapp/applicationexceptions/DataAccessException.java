package com.java.pmsapp.applicationexceptions;

public class DataAccessException extends Exception{

	public DataAccessException() {
		super("Error occurred");
	}
	public DataAccessException(String message) {
		super(message);
	}
	public DataAccessException(String message, Exception actual) {
		super(message, actual);
	}
}
