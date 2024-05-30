package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Employee;
import com.monocept.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Student student1=new Student();
		System.out.println("Please enter the details of first student : ");
		System.out.println("enter the roll number : ");
		int rollNumber=scanner.nextInt();
		student1.setRollNumber(rollNumber);
		System.out.println("enter the name : ");
		String name=scanner.next();
		student1.setName(name);
		System.out.println("enter the age : ");
		int age=scanner.nextInt();
		student1.setAge(age);
		System.out.println("details of first student : ");
		System.out.println("Roll Number : "+student1.getRollNumber());
		System.out.println("Name : "+student1.getName());
		System.out.println("Age : "+student1.getAge());
		
		Student student2=new Student();
		System.out.println("Please enter the details of second student : ");
		System.out.println("enter the roll number : ");
		rollNumber=scanner.nextInt();
		student2.setRollNumber(rollNumber);
		System.out.println("enter the name : ");
		name=scanner.next();
		student2.setName(name);
		System.out.println("enter the age : ");
		age=scanner.nextInt();
		student2.setAge(age);
		System.out.println("details of second student : ");
		System.out.println("Roll Number : "+student2.getRollNumber());
		System.out.println("Name : "+student2.getName());
		System.out.println("Age : "+student2.getAge());
		
		

	}

}
