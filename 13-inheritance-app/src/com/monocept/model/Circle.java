package com.monocept.model;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of circle is "+(3.14*radius*radius));
		
	}
	
}
