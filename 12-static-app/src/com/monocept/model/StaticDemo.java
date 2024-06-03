package com.monocept.model;

public class StaticDemo {
	private int number1;	//memory is allocated when object is created 
	private static int number2; //memory is allocated once at compile time
	
	public StaticDemo() {
		number1=0; //consider as property of object
		number2=0; //consider as property of class
	}
	
	public void increment() {
		number1++;
		number2++;
	}
	public static void decrement() {
		number2--;
	}
	public void display() {
		System.out.println("\ninside display");
		System.out.println("Number1 : "+number1);
		System.out.println("Number2 "+number2);
	}
//	{
//		System.out.println("non static");
//	}
//	static {
//		System.out.println("static");
//	}
}
