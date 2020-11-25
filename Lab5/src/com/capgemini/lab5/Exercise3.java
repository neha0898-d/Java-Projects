package com.capgemini.lab5;

import java.util.Scanner;

public class Exercise3 {

	private static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("Enter Employee Salary: ");
			int salary=sc.nextInt();
			if(salary<3000)
				throw new Exer3EmployeeException("The salary is below 3000.");
			System.out.println("The salary is above 3000");
		}catch(Exer3EmployeeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
