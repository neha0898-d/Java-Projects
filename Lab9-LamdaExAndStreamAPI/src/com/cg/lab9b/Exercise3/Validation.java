package com.cg.lab9b.Exercise3;

@FunctionalInterface
public interface Validation {
	public abstract boolean validate(String user,String pass);
}