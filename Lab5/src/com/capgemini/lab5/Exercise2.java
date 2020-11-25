package com.capgemini.lab5;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		try {
			System.out.println("Enter the employee name. ");
			String name=sc.nextLine();
			if(validateName(name)==false)
				throw new Exer2NameException("The employee name is Invalid.");
			System.out.println("Employee name is valid.");
		}catch(Exer2NameException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
	private static boolean validateName(String name) {
		String[] part=name.split(" ");
		if(part.length>=2)
			return true;
		return false;
	}

}
