package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Employee;
import com.monocept.model.Student;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Employee employee1=new Employee();
		System.out.println("Please enter the details of first employee : ");
		System.out.println("enter the id : ");
		int id=scanner.nextInt();
		employee1.setId(id);
		System.out.println("enter the name : ");
		String name=scanner.next();
		employee1.setName(name);
		System.out.println("enter the salary: ");
		double salary=scanner.nextDouble();
		employee1.setSalary(salary);
		System.out.println("details of first employee : ");
		System.out.println("Id : "+employee1.getId());
		System.out.println("Name : "+employee1.getName());
		System.out.println("Salary: "+employee1.getSalary());
		
		Employee employee2=new Employee();
		System.out.println("Please enter the details of second employee : ");
		System.out.println("enter the id : ");
		id=scanner.nextInt();
		employee2.setId(id);
		System.out.println("enter the name : ");
		name=scanner.next();
		employee2.setName(name);
		System.out.println("enter the salary : ");
		salary=scanner.nextDouble();
		employee2.setSalary(salary);
		System.out.println("details of second employee : ");
		System.out.println("Id : "+employee2.getId());
		System.out.println("Name : "+employee2.getName());
		System.out.println("Salary : "+employee2.getSalary());

	}

}
