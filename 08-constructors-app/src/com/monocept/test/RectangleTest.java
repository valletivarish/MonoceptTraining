package com.monocept.test;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle1=new Rectangle();
		
		Rectangle rectangle2=new Rectangle(10,20);
		 
		Rectangle rectangle3=new Rectangle(10);
		
		System.out.println("Rectangle height "+rectangle3.getHeight());

	}

}
