package com.monocept.whilestatement;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int result=0;
		int digit=0;
		while (number>0) {
			digit=number%10;
			
			result=(result*10)+digit;
			number=number/10;
		}
		System.out.println("the reverse of a number is "+result);

	}

}
