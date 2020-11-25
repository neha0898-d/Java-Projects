package com.cg.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int ans=getSecondSmallest(arr);
		System.out.println("The second smallest element is: "+ans);

	}
	private static int getSecondSmallest(int[] arr) {
		int ans;
		List<Integer> arrayList=new ArrayList();
		for(int i:arr) {
			arrayList.add(i);
		}
		Collections.sort(arrayList);
		ans=arrayList.get(1);
		return ans;
	}

}
