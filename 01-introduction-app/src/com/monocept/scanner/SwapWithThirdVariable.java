package com.monocept.scanner;

import java.util.Scanner;

public class SwapWithThirdVariable {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a First Number :");
		int number1 = scanner.nextInt();
		System.out.println("Enter a Second Number:");
		int number2= scanner.nextInt();
		int temp;
		System.out.println("Before Swapping:");
		System.out.println(number1+","+number2);
		temp=number1;
		number1=number2;
		number2=temp;
		System.out.println("After Swapping:");
		System.out.println(number1+","+number2);
		

	}

}
