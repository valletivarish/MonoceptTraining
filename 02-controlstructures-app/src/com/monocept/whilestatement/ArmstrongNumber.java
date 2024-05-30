package com.monocept.whilestatement;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int result=0;
		int digit=0;
		int temp=number;
		
		while (number>0) {
			digit=number%10;
			
			result=(result)+(digit*digit*digit);
			number=number/10;
		}
		if (temp==result) {
			System.out.println("it is a armstrong number");
		}
		else {
			System.out.println("it is not a armstrong number");
		}

	}

}
