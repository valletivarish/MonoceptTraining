package com.monocept.whilestatement;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int result=0;
		int digit=0;
		int i =1;
		while (i<number) {
			if(number%i==0) {
			result+=i;
			System.out.print(i+" ");
			}
			i++;
		}
		if (number==result) {
			System.out.println("\nit is a perfect number");
		}
		else {
			System.out.println("\nit is not a perfect number");
		}

	}

}
