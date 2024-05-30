package com.monocept.cla;

public class SwappingWithThirdVariable {

	public static void main(String[] args) {
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		int temp;
		System.out.println("Before Swapping = ");
		System.out.println(number1+","+number2);
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After Swapping = ");
		System.out.println(number1+","+number2);
	}

}
