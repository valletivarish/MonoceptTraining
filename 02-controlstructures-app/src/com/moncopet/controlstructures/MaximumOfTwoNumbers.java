package com.moncopet.controlstructures;

import java.util.Scanner;

public class MaximumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number:");
		int number1=scanner.nextInt();
		System.out.println("Enter a second number:");
		int number2=scanner.nextInt();
		System.out.println(maximumOfTwo(number1,number2) +" is the maximum number ");

	}

	private static int maximumOfTwo(int number1, int number2) {
		if(number1>number2) {
			return number1;
		}
		return number2;
	}

}
