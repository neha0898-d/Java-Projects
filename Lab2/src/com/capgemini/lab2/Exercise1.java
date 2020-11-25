package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Exercise1 obj=new Exercise1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits in array");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the numbers");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(obj.getSecondSmallest(arr));

	}
	
	public int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}
