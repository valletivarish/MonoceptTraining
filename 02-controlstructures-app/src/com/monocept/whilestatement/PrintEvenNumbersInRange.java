package com.monocept.whilestatement;

import java.util.Scanner;

public class PrintEvenNumbersInRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i=1;
		while (i<=N) {
			if (i%2==0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
