package com.monocept.creational.prototype.model;

public class Employee{
	private String name;
	private int id;
	private double salary;
	
	

	public Employee() {
		super();
	}



	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "{Employee Name=" + name + ", Employee ID =" + id + ", Employee salary=" + salary + "}";
	}

  
    public Employee getClone() {  
          
        return new Employee(name,id,salary);  
    }  
	
}
