package com.monocept.model;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle is "+(width*height));
	}

}
