package com.cg.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		String str=scan.nextLine();
		char[] arr=str.toCharArray();
		Map<Character,Integer> map=countChars(arr);
		Set s = map.entrySet(); 
		Iterator i = s.iterator(); 
		while(i.hasNext() ) { 
			Map.Entry entry = (Map.Entry)i.next(); 
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
	private static Map<Character, Integer> countChars(char[] arr) {
		Map<Character,Integer> map=new HashMap();
		for(int j=0;j<arr.length;j++) {
			int freq=1;
			if(arr[j]!=' '||arr[j]!=0) {
				for(int i=j+1;i<arr.length;i++) {
					if(arr[i]==arr[j]) {
						freq++;
						arr[i]=0;
					}
				}
				map.put(arr[j], freq);
			}
		}
		return map;
	}

}
