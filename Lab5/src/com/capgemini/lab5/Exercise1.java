package com.capgemini.lab5;

import java.util.Scanner;

public class Exercise1 {
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("Enter your age: ");
			int age=sc.nextInt();
			if(age<=15)
				throw new Exer1AgeException("Your age is not valid.");
			System.out.println("Age is valid.");
		}catch(Exer1AgeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
