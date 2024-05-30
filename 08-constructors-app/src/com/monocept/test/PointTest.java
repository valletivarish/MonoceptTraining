package com.monocept.test;

import com.monocept.model.Point;

public class PointTest {

	public static void main(String[] args) {
		Point point1 = new Point();
		System.out.println("Point 1 : ");
		System.out.println("X : "+point1.getX());
		System.out.println("Y : "+point1.getY());
		point1.setX(40);
		point1.setY(60);
		System.out.println("X : "+point1.getX());
		System.out.println("Y : "+point1.getY());
		Point point2 = new Point(10,50);
		System.out.println("Point 2 : ");
		System.out.println("X : "+point2.getX());
		System.out.println("Y : "+point2.getY());
		
		Point point3=new Point(point1);
		System.out.println("Point 3 : ");
		System.out.println("X : "+point3.getX());
		System.out.println("Y : "+point3.getY());
		System.out.println(point3.hashCode());
		point3=point1;
		System.out.println("X : "+point3.getX());
		System.out.println("Y : "+point3.getY());
		System.out.println(point3.hashCode());
	}

}
