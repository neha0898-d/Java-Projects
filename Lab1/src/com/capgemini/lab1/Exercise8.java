package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exercise8 obj=new Exercise8();
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(obj.checkNumber(n));

	}
	
	public boolean checkNumber(int n) {
		boolean temp=true;
		int num=2;
		boolean c=false;
		while(temp) {
			if(n==num) {
				temp=false;
				c=true;
			}
			else if(n>num) {
				num*=2;
			}
			else if(n<num) {
				temp=false;
				c=false;
			}
		}
		return c;
	}

}
