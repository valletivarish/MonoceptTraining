package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Id: "+employee.getId());
		System.out.println("Name : "+employee.getName());
		System.out.println("Salary  : "+employee.getSalary());
		System.out.println("Enter the details : ");
		System.out.println("enter the id : ");
		int id=scanner.nextInt();
		employee.setId(id);
		System.out.println("enter the name : ");
		String name=scanner.next();
		employee.setName(name);
		System.out.println("enter the salary : ");
		double salary=scanner.nextDouble();
		employee.setSalary(salary);
		
		System.out.println("Id: "+employee.getId());
		System.out.println("Name : "+employee.getName());
		System.out.println("Salary  : "+employee.getSalary());

	}

}
