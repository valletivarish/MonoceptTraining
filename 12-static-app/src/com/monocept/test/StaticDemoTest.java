package com.monocept.test;

import com.monocept.model.StaticDemo;

public class StaticDemoTest {

	public static void main(String[] args) {
		StaticDemo demo1=new StaticDemo();
		demo1.display();
		StaticDemo demo2=new StaticDemo();
		demo2.display();
		StaticDemo demo3=new StaticDemo();
		demo3.display();

		demo1.increment();
		StaticDemo.decrement();
		demo1.display();
		demo2.increment();
		StaticDemo.decrement();
		demo2.display();
		demo3.increment();
		StaticDemo.decrement();
		demo3.display();
		
	}
	static {
		
	}
}
