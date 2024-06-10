package com.monocept.model;

public class Private {
	private int number = 10; // Private variables can be accessed in this class only.
	
	public static void main(String args[]) {
		Private obj=new Private();
		int number1 = obj.number;
		System.out.println("Private : Inside the class");
		System.out.println("Number1 : "+number1);
	}
}
