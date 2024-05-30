package com.monocept.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public void setId(int id1) {
		id=id1;
	}
	public int getId() {
		return id;
	}
	public void setName(String name1) {
		name=name1;
	}
	public String getName() {
		return name;
	}
	public void setSalary(double salary1) {
		salary=salary1;
	}
	public double getSalary() {
		return salary;
	}
}
