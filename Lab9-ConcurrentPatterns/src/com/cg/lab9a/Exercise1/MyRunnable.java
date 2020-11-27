package com.cg.lab9a.Exercise1;

public class MyRunnable implements Runnable{

	private Integer countUtil;

	public MyRunnable(Integer countUtil) {
		this.countUtil=countUtil;
	}

	@Override
	public void run() {
		long sumOfIntegers=0L;
		for(int i=1;i<=countUtil;i++) {
			sumOfIntegers +=i;
		}
		System.out.println(sumOfIntegers);

	}

}
