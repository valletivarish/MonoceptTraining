package com.monocept.model;

public class DefaultSubclass extends Default {
	public static void main(String args[]) {
		DefaultSubclass obj=  new DefaultSubclass();
		int number1=obj.number;
		System.out.println("Default : Inside same package and sub class");
		System.out.println("Number1 : "+number1);
	}
}
