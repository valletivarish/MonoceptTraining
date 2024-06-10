package com.monocept.model;

public class ProtectedSubClass extends Protected{
	public static void main(String args[]) {
		ProtectedSubClass obj=new ProtectedSubClass();
		int number1=obj.number;
		System.out.println("protected : Inside same package and sub class");
		System.out.println("Number1 : "+number1);
	}
}
