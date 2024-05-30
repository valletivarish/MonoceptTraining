package com.monocept.whilestatement;

import java.util.Scanner;

public class PrintNNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i = 1;
		while (i<=N) {
			System.out.println(i);
			i++;
		}

	}

}
