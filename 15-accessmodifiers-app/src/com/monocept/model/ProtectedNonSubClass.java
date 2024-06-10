package com.monocept.model;

public class ProtectedNonSubClass {
	
	public static void main(String args[]) {
		Protected obj =new Protected();
		int number1=obj.number;
		System.out.println("Protected :  same package but non sub class");
		System.out.println("Number1 : "+number1);
	}
}
