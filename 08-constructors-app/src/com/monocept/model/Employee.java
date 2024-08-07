package com.monocept.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		id=0;
		name="user";
		salary=0.0;
	}
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return this.salary;
	}
}
