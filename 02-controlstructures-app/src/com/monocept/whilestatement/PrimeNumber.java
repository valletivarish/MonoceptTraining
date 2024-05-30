package com.monocept.whilestatement;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		boolean flag=false;
		int i = 2;
		if (number<2) {
			flag=true;

		}
		else {
			while (i<number){
				if (number%i==0) {
					flag=true;
				}
				i++;
			}
			
		}
		if (flag) {
			System.out.println("Not a prime");
		}
		else {
			System.out.println("It is a prime");
		}
		
	
		
		scanner.close();
	}

}
