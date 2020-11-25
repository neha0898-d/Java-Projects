package com.capgemini.lab5;

public class Exer3EmployeeException extends Exception{
	private String message;

	public Exer3EmployeeException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
