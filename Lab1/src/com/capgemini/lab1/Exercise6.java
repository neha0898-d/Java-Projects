package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exercise6 obj=new Exercise6();
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(obj.calculateDifference(n));

	}
	
	public int calculateDifference(int n) {
		int s1=0,s2=0;
		for(int i=1;i<=n;i++) {
			s1+=(i*i);
			s2+=i;
		}
		return (s2*s2)-s1;
		
	}

}
