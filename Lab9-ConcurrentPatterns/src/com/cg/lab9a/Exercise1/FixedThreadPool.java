package com.cg.lab9a.Exercise1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
	private static final int NTHREADS=10;
	public static void main(String[] args) {
		ExecutorService executor= 
				Executors.newFixedThreadPool(NTHREADS);
		int i=0;
		for(i=0;i<10;i++) {
			executor.execute(new MyRunnable(2));
		}
		System.out.println(i);
		executor.shutdown();

	}

}
