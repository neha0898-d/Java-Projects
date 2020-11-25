package com.cg.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer,String> hashMap=new HashMap();

		boolean loopAgain=true;
		do {

			System.out.print("Enter ID number:");
			Integer idNumber = Integer.parseInt(scan.nextLine());

			System.out.print("Enter Name:");
			String name = scan.nextLine();

			String oldVal = hashMap.put(idNumber, name);

			if (oldVal!=null) {
				System.out.println("Student Id Number:" + idNumber + " is "
						+ oldVal + " and has been overwritten by " + name);
			}


			System.out.print("Enter another student (y/n)?");
			String answer = scan.nextLine();


			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				loopAgain=false;
				break;
			}

		} while (loopAgain);

		List<String> list=getvalues(hashMap);
		for(String l: list) {
			System.out.println(l);
		}
	}
	private static List<String> getvalues(Map<Integer, String> hashMap) {
		List<String> list=new ArrayList();
		Set s = hashMap.entrySet(); 
		Iterator i = s.iterator(); 
		while(i.hasNext() ) { 
			Map.Entry entry = (Map.Entry)i.next(); 
			list.add((String) entry.getValue());
		}
		Collections.sort(list);
		return list;

	}

}
