package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exercise7 obj=new Exercise7();
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(obj.checkNumber(n));

	}
	
	public boolean checkNumber(int n) {
		int temp;
		int lastSeen=10;
		while (n > 0) {
	        temp = n % 10;
	        if (lastSeen < temp)
	            return false;
	        lastSeen = temp;
	        n /= 10;
	    }
	    return true;
	}

}
