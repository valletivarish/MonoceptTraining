package com.monocept.scanner;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a first Number:");
		int number1=scanner.nextInt();
		System.out.println("Enter a second Number:");
		int number2=scanner.nextInt();
		int multiplication=number1*number2;
		System.out.println("Multiplication:"+multiplication);
		
	}

}
