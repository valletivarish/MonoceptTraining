package com.monocept.test;

import com.monocept.model.Circle;
import com.monocept.model.Rectangle;
import com.monocept.model.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.area();
		Rectangle rectangle = new Rectangle(10,10);
		rectangle.area();
	
}

}
