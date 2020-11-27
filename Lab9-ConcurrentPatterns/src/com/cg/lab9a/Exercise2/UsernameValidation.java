package com.cg.lab9a.Exercise2;

import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation implements Callable<Boolean>{
	String userName;
	
	public UsernameValidation() {
		
	}
	
	public UsernameValidation(String s) {
		this.userName=s;
	}
	
	@Override
	public Boolean call() throws Exception {
		Boolean b=false;
		String pattern="[A-Za-z0-9_&*!@#$]{8,}(_job)$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(userName);
		if(m.find()) {
			b=true;
		}
		return b;
	}
	
}
