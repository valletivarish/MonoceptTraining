package com.monocept.whilestatement;

import java.util.Scanner;

public class TableOfNNumbers {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int N=scanner.nextInt();
		int i=1;
		while (i<=N) {
			int j=1;
			while (j<=N) {
				System.out.print(i*j+"\t");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
