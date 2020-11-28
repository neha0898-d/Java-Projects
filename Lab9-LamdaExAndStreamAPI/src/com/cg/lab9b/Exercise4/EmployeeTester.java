package com.cg.lab9b.Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;



public class EmployeeTester {

	public static void main(String[] args) {
		List<Employee> emplist=new ArrayList();
		Supplier <Employee> supplier=
				()->{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter employee details: ");
					System.out.println("Employee id: ");
					int empno=sc.nextInt();
					System.out.println("Employee Name: ");
					String ename=sc.next();
					//sc.next();
					System.out.println("Salary: ");
					Double salary=sc.nextDouble();
					return new Employee(empno,ename,salary);
				};
				for(int i=0;i<2;i++) {
					emplist.add(supplier.get());
				}
				emplist.stream()
				.map(Employee :: getEname)
				.forEach(System.out :: println);
	}

}
