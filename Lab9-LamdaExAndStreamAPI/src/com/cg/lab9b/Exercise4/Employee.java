package com.cg.lab9b.Exercise4;

import java.time.LocalDate;

public class Employee {
	private Integer empno;
	private String ename;
	private Double salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer empno, String ename, Double salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.salary = salary;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", salary=" + salary + "]";
	}

	
	
	
}
