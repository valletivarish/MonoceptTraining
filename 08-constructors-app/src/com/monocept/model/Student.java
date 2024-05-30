package com.monocept.model;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	
	public Student() {
		rollNumber=1;
		name="student";
		age=20;
	}
	public Student(int rollnumber1, String name1, int age1) {
		rollNumber=rollnumber1;
		name=name1;
		age=age1;
	}
	
	public void setRollNumber(int rollnumber1) {
		rollNumber=rollnumber1;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setName(String name1) {
		name=name1;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age1) {
		age=age1;
	}
	public int getAge() {
		return age;
	}
}
