package com.monocept.test;

import com.monocept.model.Circle;
import com.monocept.model.Rectangle;
import com.monocept.model.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape;
		shape = new Circle(10);
		shape.area();
		shape.perimeter();
		Rectangle rectangle=new Rectangle(10,20);
		rectangle.area();
		rectangle.perimeter();

	}

}
