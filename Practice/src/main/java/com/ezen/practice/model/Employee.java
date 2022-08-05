package com.ezen.practice.model;

import com.ezen.practice.model.Employee;

public class Employee {
	
	private Integer employee_id;
	
	public Employee(Integer employee_id) {
		this.employee_id = employee_id;
	}
	
	
	@Override
	public int hashCode() {
		return employee_id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj.hashCode() == this.hashCode();
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(13);
		Employee emp2 = new Employee(101);
		Employee emp3 = new Employee(13);
		
		System.out.println(Integer.toString(emp1.hashCode(), 16).toUpperCase());
		System.out.println(Integer.toString(emp2.hashCode(), 16).toUpperCase());
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals("I'm String"));
		System.out.println(emp1.equals(emp3));
	}
}

