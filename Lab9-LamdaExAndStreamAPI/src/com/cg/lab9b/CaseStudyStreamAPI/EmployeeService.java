package com.cg.lab9b.CaseStudyStreamAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

	public static void main(String[] args) {
		EmployeeRepository empR=new EmployeeRepository();
		empR.setEmployeeData();
		//1.Find out the sum of salary of all employees. 
		double sum=empR.getEmpList().stream().collect(Collectors.summingDouble(Employee :: getSalary));
		System.out.println("Sum of salaries of all employees: "+sum);

		//2.List out department names and count of employees in each department. 
		Map<String, List<Employee>> map=empR.getEmpList().stream().collect(Collectors.groupingBy(t->t.getDepartment().getDepartmentName()));
		for(String s: map.keySet()) {
			System.out.println(s+"-"+map.get(s).size());
		}

		//3.Find out the senior most employee of an organization.
		Optional<Employee> old=empR.getEmpList().stream().collect(Collectors.minBy(Comparator.comparing(Employee::getHireDate)));
		System.out.println(old.get().getFirstName());

		//4.List employee name and duration of their service in months and days. 
		List<Employee> list=empR.getEmpList();
		for(Employee employee: list) {
			System.out.println(employee.getFirstName()+" "+ChronoUnit.MONTHS.between(employee.getHireDate(),LocalDate.now()));
		}

		//5.Find out employees without department.
		empR.getEmpList().stream().filter((employee)->employee.getDepartment().getDepartmentName().equals("")).collect(Collectors.toList()).forEach(System.out::println);

		//6.Find departments with highest count of employees.
		Map<String,List<Employee>> map1=empR.getEmpList().stream().collect(Collectors.groupingBy((employee)->employee.getDepartment().getDepartmentName()));
		int max=0;
		String department="";
		for(String s: map.keySet()) {
			if(map.get(s).size()>max) {
				max=map.get(s).size();
				department=s;
			}
		}
		System.out.println(department+" "+max);
		
		//7.Find employees who didn’t report to anyone (Hint: Employees without manager)
		empR.getEmpList().stream().filter((employee)->employee.getManagerId()==null).collect(Collectors.toList()).forEach(System.out::println);
		
		//8.List employee name, salary and salary increased by 15%. 
		List<Employee> list1=empR.getEmpList().stream().collect(Collectors.toList());
		for(Employee emp: list1) {
			System.out.println(emp.getFirstName()+" "+emp.getLastName()+" Salary: "+emp.getSalary()+" salary raised: "+emp.getSalary()*1.15);
		}
		
		
	}
}