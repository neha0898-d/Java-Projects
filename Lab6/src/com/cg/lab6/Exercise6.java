package com.cg.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise6 {
	private static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer,Integer> voters=new HashMap();

		boolean loopAgain=true;
		do {

			System.out.print("Enter Id: ");
			Integer id = Integer.parseInt(scan.nextLine());

			System.out.print("Enter Age:");
			Integer age = scan.nextInt();

			scan.nextLine();
			voters.put(id, age);
			System.out.print("Enter another person (y/n)?");
			String answer = scan.nextLine();
			


			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				//loopAgain=false;
				break;
			}

		} while (loopAgain);
		List<Integer> list=votersList(voters);
		for(Integer l:list) {
			System.out.println(l);
		}
	}
	private static List<Integer> votersList(Map<Integer, Integer> voters) {
		List<Integer> list=new ArrayList();
		Set s=voters.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext() ) {
			Map.Entry entry = (Map.Entry)i.next();
			if((int)entry.getValue()>18) {
				list.add((Integer) entry.getKey());
			}
		}
		return list;
	}

}
