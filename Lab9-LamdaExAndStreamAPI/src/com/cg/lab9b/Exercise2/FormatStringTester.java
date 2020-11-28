package com.cg.lab9b.Exercise2;

import java.util.Scanner;

public class FormatStringTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FormatString format= (s)->(s.replaceAll(".(?!$)", "$0 "));
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		System.out.println("Formatted String: "+format.fun(s));
	}

}
