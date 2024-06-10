package com.monocept.model;

public class Rectangle implements Shape{
	private double length;
	private double breadth;
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is "+(length*breadth));
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Rectangle is "+(2*(length+breadth)));
		
	}

}
