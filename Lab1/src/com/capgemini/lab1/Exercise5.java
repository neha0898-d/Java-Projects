package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Exercise5 obj=new Exercise5();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println(obj.calculateSum(n));

	}
	
	public int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if((i%3)==0 || (i%5)==0)
				sum+=i;
		}
		return sum;
	}

}
