package com.cg.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise3 {
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		Map<Integer,Integer> map=getSquares(arr);
		Set s = map.entrySet(); 
		Iterator i = s.iterator(); 
		while(i.hasNext() ) { 
			Map.Entry entry = (Map.Entry)i.next(); 
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
	private static Map<Integer, Integer> getSquares(int[] arr) {
		Map<Integer, Integer> map=new HashMap();
		for(int i=0;i<arr.length;i++) {
			int s=arr[i]*arr[i];
			map.put(arr[i],s);
		}
		return map;
	}

}
