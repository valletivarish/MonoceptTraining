package com.monocept.scanner;

import java.util.Scanner;

public class Subtraction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int number1 = scanner.nextInt();
		System.out.println("Enter a Second Number:");
		int number2= scanner.nextInt();
		int subtraction= number1 - number2;
		System.out.println("Subtraction :"+subtraction);

	}

}
