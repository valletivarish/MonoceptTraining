package com.moncopet.controlstructures;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number:");
		int number= scanner.nextInt();
		System.out.println(checkEvenOrOdd(number));
	}

	private static String checkEvenOrOdd(int number) {
		if (number%2==0) {
			return "Even";
		}
		return "Odd";	
	}
}
