package com.cg.lab8.exercise2;

public class TimerThreadTester {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Runnable runnable= new TimerThread();
		//Attach Runnable object to Thread object
		Thread t1= new Thread(runnable);
		t1.start();
		while(true) {
			t1.run();
			
		}
	}

}
