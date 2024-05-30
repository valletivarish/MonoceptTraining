package com.monocept.assignment;

import java.util.Scanner;

public class CurrenyApplication {

	public static void main(String[] args) {
		System.out.println("Enter the amount you want to withdraw from the atm:");
		Scanner scanner=new Scanner(System.in);
		int amount = scanner.nextInt();
		int two_thousand=0;
		int five_hundred=0;
		int two_hundred=0;
		int hundred=0;
		if (amount<=50000 && amount%100==0) {
			while (amount>=100) {
				if (amount>=2000) {
					two_thousand=amount/2000;
					amount=amount-(2000*two_thousand);
				}
				else if(amount>=500) {
					five_hundred=amount/500;
					amount=amount-(500*five_hundred);
				}
				else if(amount>=200) {
					two_hundred=amount/200;
					amount=amount-(200*two_hundred);
				}
				else {
					hundred=amount/100;
					amount=amount-(100*hundred);
				}
			}
			if (two_thousand!=0) {
				System.out.println("Two thousand: "+two_thousand);
			}
			if (five_hundred!=0) {
				System.out.println("Five hundred: "+five_hundred);
			}
			if (two_hundred!=0) {
				System.out.println("Two hundred: "+two_hundred);
			}
			if (hundred!=0) {
				System.out.println("hundred: "+hundred);
			}
		}
		else if(amount<=50000 && amount%100!=0) {
			System.out.println("Amount should be in multiples of 100");
	
		}
		else {
			System.out.println("Amount exceeds withdrawal limit of 50000");
		}

	}

}










//int quantity_of_two_thousand=10;
//int quantity_of_five_hundred=10;
//int quantity_of_two_hundred=10;
//int quantity_of_hundred=10;
//int value_of_two_thousand=10*quantity_of_two_thousand;
//int value_of_five_hundred=10*quantity_of_five_hundred;
//int value_of_two_hundred=10*quantity_of_two_hundred;
//int value_of_hundred=100*quantity_of_hundred;
