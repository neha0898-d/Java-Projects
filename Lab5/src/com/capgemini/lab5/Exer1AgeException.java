package com.capgemini.lab5;

public class Exer1AgeException extends Exception{
	private String message;
	
	public Exer1AgeException() {
		
	}
	public Exer1AgeException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return this.message;
	}

	
}
