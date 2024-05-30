package com.monocept.model;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	private String emailId;
	private CourseType course;
	public Student(int rollNumber, String name, int age, String emailId, CourseType course) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.course = course;
	}
	public Student() {
		super();
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public CourseType getCourse() {
		return course;
	}
	public void setCourse(CourseType course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", emailId=" + emailId
				+ ", course=" + course + "]";
	}
	
	
	
	
	
	
}
