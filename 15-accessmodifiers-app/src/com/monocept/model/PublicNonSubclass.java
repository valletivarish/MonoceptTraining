package com.monocept.model;

public class PublicNonSubclass {
	
	public static void main(String args[]) {
		Public obj =new Public();
		int number1=obj.number;
		System.out.println("Public : Inside Package but non sub class");
		System.out.println("Number1 : "+number1);
	}
}
