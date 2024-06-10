package com.monocept.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.monocept.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		System.out.println("How many Employees : ");
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter details for employee "+(i+1)+" :");
			System.out.println("Enter the Id : ");
			int employeeId=scanner.nextInt();
			System.out.println("Enter the name : ");
			String employeeName=scanner.next();
			System.out.println("Enter the salary : ");
			double salary=scanner.nextDouble();
			Employee employee=new Employee(employeeId,employeeName,salary);
			employees.add(employee);
		}
//		Iterator employeeIterator=employees.iterator();
//		while(employeeIterator.hasNext()) {
//			System.out.println(employeeIterator.next());
//		}
		ListIterator employeeListIterator=employees.listIterator();
//		while(employeeListIterator.hasNext()) {
//			System.out.println(employeeListIterator.next());
//		}
		while(employeeListIterator.hasPrevious()) {
			System.out.println(employeeListIterator.previous());
		}

	}

}
