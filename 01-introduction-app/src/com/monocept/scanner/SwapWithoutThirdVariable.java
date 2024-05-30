package com.monocept.scanner;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int number1 = scanner.nextInt();
		System.out.println("Enter a Second Number:");
		int number2= scanner.nextInt();
		System.out.println("Before Swapping:");
		System.out.println(number1+","+number2);
		number1 = number1 + number2;
		number2=  number1 - number2;
		number1=  number1 - number2;
		System.out.println("After Swapping:");
		System.out.println(number1+","+number2);

	}

}
