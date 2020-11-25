package com.capgemini.lab5;

public class Exer2NameException extends Exception {
	private String message;

	public Exer2NameException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
