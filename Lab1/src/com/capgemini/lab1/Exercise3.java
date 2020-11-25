package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Exercise3 obj=new Exercise3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println("Using recursive method: "+obj.recur(n));
		System.out.println("Using non recursive: "+obj.nonRecur(n));;
	}

	private int nonRecur(int n) {
		if (n <= 1) 
		       return n; 
		    return nonRecur(n-1) + nonRecur(n-2);
	}

	private int recur(int n) {
		int f[] = new int[n+2];
	    int i; 
	    
	    f[0] = 0; 
	    f[1] = 1; 
	      
	    for (i = 2; i <= n; i++) 
	    { 
	      
	        f[i] = f[i-1] + f[i-2]; 
	    } 
	       
	    return f[n];
	}

}
