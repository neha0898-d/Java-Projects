package com.cg.lab9b.Exercise5;

public class Factorial {
	private int num;
	
	public Factorial() {
		
	}
	
	public Factorial(int num) {
		super();
		this.num=num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public int calculateFact() {
		int fact=1;
		if(num==0) {
			fact=1;
		}
		else {
			for(int i=1;i<=num;i++) {
				fact*=i;
			}
		}
		return fact;
	}
	
}
