package com.cg.lab9a.Exercise2;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsernameValidationDemo {
	private static final int NTHREADS=10;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ExecutorService executor= 
				Executors.newFixedThreadPool(NTHREADS);
		Future<Boolean> future=null;
		for(int i=0;i<=5;i++) {
			System.out.println("Enter the Username: ");
			String s=sc.nextLine();
			future=	executor.submit(new UsernameValidation(s));
			Boolean result;
			try {
				result = future.get();
				if(result==true)
					System.out.println("Username is valid.");
				else
					System.out.println("Username is invalid.");
			} catch (InterruptedException e) {			
				e.printStackTrace();
			} catch (ExecutionException e) {			
				e.printStackTrace();
			}
			
		}
		
		executor.shutdown();
	}

}
