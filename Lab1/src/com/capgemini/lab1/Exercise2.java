package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Exercise2 obj=new Exercise2();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a light color red, yellow, or green ");
		String colour=sc.nextLine();
		switch(colour.toUpperCase()) {
		case "RED":
			System.out.println("STOP");
			break;
		case "YELLOW":
			System.out.println("READY");
			break;
		case "GREEN":
			System.out.println("GO");
			break;
		default:
			System.out.println("Invalid colour");
		}
	}

}
