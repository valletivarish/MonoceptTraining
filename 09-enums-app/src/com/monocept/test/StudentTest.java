package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.CourseType;
import com.monocept.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter no of students : ");
		int n=scanner.nextInt();
		Student students[]=new Student[n];
		
		for(int i=0;i<students.length;i++) {
			students[i]=new Student();
			System.out.println("Enter the student rollnumber : ");
			students[i].setRollNumber(scanner.nextInt());
			System.out.println("Enter the student name : ");
			students[i].setName(scanner.next());
			System.out.println("Enter the student age : ");
			students[i].setAge(scanner.nextInt());
			System.out.println("Enter the student email id : ");
			students[i].setEmailId(scanner.next());
			System.out.println("Enter the course type : press 1 for AI press 2 for CSE press 3 for ECE press 4 EEE  press 5 for IT");
			int courseType=scanner.nextInt();
			if(courseType==1) {
				students[i].setCourse(CourseType.AI);
			}
			else if(courseType==2) {
				students[i].setCourse(CourseType.CSE);
			}
			else if(courseType==3) {
				students[i].setCourse(CourseType.ECE);
			}
			else if(courseType==4) {
				students[i].setCourse(CourseType.EEE);
			}
			else if(courseType==5) {
				students[i].setCourse(CourseType.IT);
			}
		}
		
		for(Student student:students) {
			System.out.println(student);
		}

	}

}
