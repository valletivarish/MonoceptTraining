package com.monocept.model;

public class OuterClass {
	private int number=0;
	public void displayOuter() {
		System.out.println("Outside Class");
	}
	public class InnerClass{
		public void displayInner() {
			number=10;
			System.out.println("Inner Class");
		}
	}
}
