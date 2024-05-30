package com.monocept.whilestatement;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int result=0;
		int digit=0;
		int temp=number;
		while (number>0) {
			digit=number%10;
			
			result=(result*10)+digit;
			number=number/10;
		}
		if (temp==result) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}

	}

}
