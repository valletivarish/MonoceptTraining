package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student=new Student();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Roll Number : "+student.getRollNumber());
		System.out.println("Name : "+student.getName());
		System.out.println("Age  : "+student.getAge());
		System.out.println("Enter the details : ");
		System.out.println("enter the rollnumber : ");
		int rollnumber=scanner.nextInt();
		student.setRollNumber(rollnumber);
		System.out.println("enter the name : ");
		String name=scanner.next();
		student.setName(name);
		System.out.println("enter the age : ");
		int age=scanner.nextInt();
		student.setAge(age);
		
		System.out.println("Roll Number : "+student.getRollNumber());
		System.out.println("Name : "+student.getName());
		System.out.println("Age  : "+student.getAge());
		

	}

}
