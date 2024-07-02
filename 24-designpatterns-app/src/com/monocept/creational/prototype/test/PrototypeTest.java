package com.monocept.creational.prototype.test;

import com.monocept.creational.prototype.model.Employee;

public class PrototypeTest {

	public static void main(String[] args) {
		System.out.println("Details of employee 1: ");
		Employee employee1=new Employee("Varish", 69, 10000);
		System.out.println(employee1);
		System.out.println("hashcode of employee1 object : "+employee1.hashCode());
		System.out.println();
		System.out.println("Details of employee 2: ");
		Employee employee2=employee1.getClone();
		System.out.println(employee2);
		employee2.setId(70);
		employee2.setName("John");
		employee2.setSalary(20000);
		System.out.println(employee2);
		System.out.println("hashcode of employee2 object : "+employee2.hashCode());

	}

}
