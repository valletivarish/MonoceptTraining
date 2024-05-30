package com.monocept.model;

public class Rectangle {
	int height;
	int width;
	int area;
	
	public void setHeight(int height2) {
		height=height2;
	}
	public int getHeight() {
		return height;
	}
	public void setWidth(int width2) {
		width=width2;
	}
	public int getWidth() {
		return width;
	}
	public int getArea() {
		return getHeight()*getWidth();
	}
}
