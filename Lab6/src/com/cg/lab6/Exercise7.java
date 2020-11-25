package com.cg.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercise7 {
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int[] ans=getSorted(arr);
		
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}
	private static int[] getSorted(int[] arr) {
		int[] ans=new int[arr.length];
		List<Integer> list=new ArrayList();
		for(int i=0;i<arr.length;i++) {
			StringBuffer sbr=new StringBuffer(Integer.toString(arr[i]));
			sbr.reverse();
			list.add(Integer.parseInt(sbr.toString()));
		}
		Collections.sort(list);
		int j=0;
		Iterator i=list.iterator();
		while(i.hasNext()) {
			ans[j]=(int) i.next();
			j++;
		}
		return ans;
	}

}
