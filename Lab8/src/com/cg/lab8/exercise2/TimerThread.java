package com.cg.lab8.exercise2;

import java.util.concurrent.TimeUnit;

public class TimerThread implements Runnable{

	@Override
	public synchronized void run() {

		long elapsedSeconds;
		long startTime = System.currentTimeMillis();
		do {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long elapsedTime = System.currentTimeMillis() - startTime;
			elapsedSeconds = elapsedTime / 1000;
			if(elapsedSeconds==10) {
				startTime=System.currentTimeMillis();
			}
			System.out.println("Timer: 00:"+elapsedSeconds);
		}while(elapsedSeconds<=10);
	}

}


