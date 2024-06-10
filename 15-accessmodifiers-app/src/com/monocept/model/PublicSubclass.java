package com.monocept.model;

public class PublicSubclass extends Public{
	public static void main(String args[]) {
		PublicSubclass obj=new PublicSubclass();
		int number1=obj.number;
		System.out.println("Public : Inside subclass");
		System.out.println("Number1 : "+number1);
	}
}
