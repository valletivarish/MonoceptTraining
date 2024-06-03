package com.monocept.model;

public class Box {
	private double width;
	private double height;
	private double depth;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public Box() {
		
	}
	public Box(double width, double height, double depth) {

		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
}
