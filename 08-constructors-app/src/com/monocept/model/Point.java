package com.monocept.model;

public class Point {

	private int x;
	private int y;
	
	public Point(){
		x=1;
		y=1;
	}
	public Point(int x1, int y1) {
		x=x1;
		y=y1;
	}
	public Point(Point point) {
		x=point.getX();
		y=point.getY();
	}
	
	public void setX(int x1) {
		x=x1;
	}
	public int getX() {
		return x;
	}
	public void setY(int y1) {
		y=y1;
	}
	public int getY() {
		return y;
	}
}
