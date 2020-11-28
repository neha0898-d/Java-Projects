package com.cg.lab10.Exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\capgemini_demo\\Lab10\\bin\\com\\cg\\lab10\\Exercise1\\source.txt");
			Scanner sc=new Scanner(fis);
			int i=1;
			while(sc.hasNext()) {
				System.out.println(i+". "+sc.nextLine());
				i++;
			}
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
