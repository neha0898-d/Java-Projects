package com.cg.lab6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer,Integer> student=new HashMap();

		boolean loopAgain=true;
		do {

			System.out.print("Enter Registration number:");
			Integer regNumber = Integer.parseInt(scan.nextLine());

			System.out.print("Enter Marks:");
			Integer marks = scan.nextInt();

			scan.nextLine();
			student.put(regNumber, marks);
			System.out.print("Enter another student (y/n)?");
			String answer = scan.nextLine();
			


			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				//loopAgain=false;
				break;
			}

		} while (loopAgain);
		Map<Integer,String> map=getStudents(student);
		Set s = map.entrySet(); 
		Iterator i = s.iterator(); 
		while(i.hasNext() ) {
			Map.Entry entry = (Map.Entry)i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
	private static Map<Integer, String> getStudents(Map<Integer, Integer> student) {
		Map<Integer,String> map=new HashMap();
		Set s = student.entrySet(); 
		Iterator i = s.iterator(); 
		while(i.hasNext() ) { 
			Map.Entry entry = (Map.Entry)i.next(); 
			if((int)entry.getValue()>=90) {
				map.put((Integer) entry.getKey(), "Gold");
			}
			else if((int)entry.getValue()>=80 && (int)entry.getValue()<90) {
				map.put((Integer) entry.getKey(), "Silver");
			}
			else if((int)entry.getValue()>=70 && (int)entry.getValue()<80) {
				map.put((Integer) entry.getKey(), "Bronze");
			}
		}
		return map;
	}

}
