package com.cg.lab9b.Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

import com.cg.lab9b.Exercise4.Employee;

public class FactorialTester {

	public static void main(String[] args) {
		List<Factorial> list=new ArrayList();
		Supplier <Factorial> supplier=
				()->{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter a number: ");
					int num=sc.nextInt();
					return new Factorial(num);
				};
				list.add(supplier.get());
				list.stream()
				.map(Factorial :: calculateFact)
				.forEach(System.out :: println);
	}
	}


