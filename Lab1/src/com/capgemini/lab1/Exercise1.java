package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 obj=new Exercise1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		System.out.println(obj.calculateSum(n));

	}

	private int calculateSum(int n) {
		int sum=0;
		while(n!=0) {
			int temp=n%10;
			sum+=(temp*temp*temp);
			n/=10;
		}
		return sum;
	}

}
