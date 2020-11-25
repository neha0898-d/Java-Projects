package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise4 {
	static boolean isPrime(int n) 
	{ 
	
	if (n <= 1) 
	    return false; 
	  
	 
	for (int i = 2; i < n; i++) 
	    if (n % i == 0) 
	        return false; 
	  
	return true; 
	} 
	  
	
	static void printPrime(int n) 
	{ 
	for (int i = 2; i <= n; i++)  
	{ 
	    if (isPrime(i)) 
	        System.out.print(i + " "); 
	} 
	} 
	  
	
	public static void main(String[] args) {
		Exercise4 obj=new Exercise4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt(); 
	    printPrime(n);
	}

}
