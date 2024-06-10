package com.monocept.model;

public class DefaultNonSubclass {
	
	public static void main(String args[]) {
		Default obj=new Default();
		int number1=obj.number;
		System.out.println("Default : Inside same package but non sub class");
		System.out.println("Number1 : "+number1);
	}
}
