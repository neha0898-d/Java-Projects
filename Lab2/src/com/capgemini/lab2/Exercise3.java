package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter the array:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] last=getSorted(arr);
		{
			System.out.println("Array is :"+ Arrays.toString(last)); 
		}
	}
	private static int[] getSorted(int arr[]){
		for(int i=0;i<arr.length;i++) {
			StringBuffer sbr=new StringBuffer(Integer.toString(arr[i]));
			sbr.reverse();
			arr[i]=Integer.parseInt(sbr.toString());
		}
		Arrays.sort(arr);
		return arr;

	}
}