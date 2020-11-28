package com.cg.lab9b.Exercise1;

import java.util.Scanner;

public class PowerTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Power fun= (x,y)->(Math.pow(x, y));
		System.out.println("Enter two numbers: ");
		double x=sc.nextDouble();
		double y=sc.nextDouble();
		System.out.println("Result: "+(int)fun.power(x, y));
	}

}
