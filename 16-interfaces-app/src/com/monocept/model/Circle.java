package com.monocept.model;

public class Circle implements Shape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle is : "+(3.14*radius*radius));
		
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Circle is "+(2*3.14*radius));
		
	}
	
}
