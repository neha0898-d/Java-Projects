package com.cg.lab9b.Exercise3;

import java.util.Scanner;

public class ValidationTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Validation validator= (user,pass)->{
			boolean b=false;
			if(user.equals("NehaDhawale")&& pass.equals("Pass$1234")) 
				b=true;
			return b;};
			System.out.println("Enter the Username: ");
			String user=sc.nextLine();
			System.out.println("Enter the Password: ");
			String pass=sc.nextLine();
			if(validator.validate(user, pass)==true)
				System.out.println("Authentication Successfull");
			else
				System.out.println("Authentication Failed");
	}

}
