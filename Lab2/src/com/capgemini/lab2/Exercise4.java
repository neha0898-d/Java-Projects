package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Exercise4 obj=new Exercise4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of digits in array");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the numbers");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans[]=obj.modifyArray(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

	private int[] modifyArray(int[] arr) {
		int temp[]=new int[arr.length];
		Arrays.sort(arr);
		int j = 0; 
        for (int i=0; i<arr.length-1; i++) 
           
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        
        temp[j++] = arr[arr.length-1];    
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
        
		return arr;
	}

}
