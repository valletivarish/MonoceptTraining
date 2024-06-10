package com.monocept.model;

public class Default {
	int number=10; // Default variables can be accessed in this class, subclasses, and non-subclasses. They can be accessed anywhere within the package only.

	public static void main(String[] args) {
        Default obj = new Default();
        int number1=obj.number;
        System.out.println("Default : Inside Same class");
        System.out.println("Number1 : "+number1);
    }
}
