package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Rectangle rectangle=new Rectangle();
		System.out.println("Enter the height and width of the rectangle : ");
		System.out.println("Enter the height : ");
		int height=scanner.nextInt();
		rectangle.setHeight(height);
		System.out.println("enter the width : ");
		int width=scanner.nextInt();
		rectangle.setWidth(width);
		System.out.println("height : "+rectangle.getHeight());
		System.out.println("width : "+rectangle.getWidth());
		
		System.out.println("Area : "+rectangle.getArea());

	}

}
