package com.cg.lab9b.CaseStudyStreamAPI;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	private static List<Employee> empList=new ArrayList();

	public static List<Employee> getEmpList() {
		return empList;
	}
	
	public static void setEmployeeData() {
		Department d1=new Department(101,"IT",1);
		Department d2=new Department(102,"Marketing",2);
		Department d3=new Department(103,"Accounts",3);
		Department d4=new Department(104,"Admin",4);
		empList.add(new Employee(1001,"Chetan","Dighe","chetan@gmail.com","5621353",
				LocalDate.of(2020, 11, 5),"Developer",50000.0,1,d1));
		empList.add(new Employee(1002,"Mukta","Diware","mukta@gmail.com","4561332",
				LocalDate.of(2019, 1, 15),"Manager",80000.0,2,d2));
		empList.add(new Employee(1003,"Neha","Dhawale","neha@gmail.com","5412132",
				LocalDate.of(2019, 5, 6),"Manager",85000.0,3,d3));
		empList.add(new Employee(1004,"Deep","Dhawale","deep@gmail.com","8465312",
				LocalDate.of(2018, 2, 10),"receptionist",30000.0,null,d4));
	}
	
}
