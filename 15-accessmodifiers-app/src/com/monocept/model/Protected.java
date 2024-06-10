package com.monocept.model;

public class Protected {
	protected int number=10; 
	// Protected variables can be accessed in the same class, subclasses, and non-subclasses, 
	//if accessed from a different package, the accessing class must be a subclass of the class where the protected member is defined

	public static void main(String args[]) {
		Protected obj=new Protected();
		int number1=obj.number;
		System.out.println("Protected : Inside same Class");
		System.out.println("Number1 : "+number1);
	}
}
