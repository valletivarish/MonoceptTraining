package com.moncopet.controlstructures;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scanner.nextInt();
		System.out.println(checkPostiveOrNegative(number));

	}

	private static String checkPostiveOrNegative(int number) {
		if(number<0) {
			return "Negative";
		}
		return "Positive";
	}

}
