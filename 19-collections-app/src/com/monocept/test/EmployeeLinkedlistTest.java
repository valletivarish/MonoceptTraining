package com.monocept.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import com.monocept.model.EmployeeLinkedList;

public class EmployeeLinkedlistTest {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		Scanner scanner=new Scanner(System.in);
		System.out.println("how many employeees......");
		int count=scanner.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter details for employee "+(i+1)+" :");
			System.out.println("Enter the Id : ");
			int employeeId=scanner.nextInt();
			System.out.println("Enter the name : ");
			String employeeName=scanner.next();
			System.out.println("Enter the salary : ");
			double salary=scanner.nextDouble();
			EmployeeLinkedList employee=new  EmployeeLinkedList(employeeId, employeeName, salary);
			list.add(employee);
			}
		Iterator emp=list.iterator();
		while(emp.hasNext()) {
			System.out.println(emp.next());
		}
		ListIterator emp1=list.listIterator();
		while(emp1.hasNext()) {
			System.out.println(emp1.next());
		}
		while(emp1.hasPrevious()) {
			System.out.println(emp1.previous());
		}

	}

}
