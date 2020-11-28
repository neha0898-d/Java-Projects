package com.cg.lab10.Exercise2;

import java.io.File;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the filename: ");
		String filename=sc.nextLine();
		File f=new File(filename);
		System.out.println("File exist: "+f.exists());
		if(f.exists()) {
			System.out.println("File is readable: "+f.canRead());
			System.out.println("File is writable: "+f.canWrite());
			System.out.println("File last modified: "+f.lastModified());
			System.out.println("Length of file: "+f.length()+" bytes");
		}
	}

}
