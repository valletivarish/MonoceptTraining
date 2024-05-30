package com.monocept.whilestatement;

import java.util.Scanner;

public class FactorialOfN {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int N = scanner.nextInt();
		int result=1;
		while (N>0){
			if (N==0) {
				break;
			}
			else {
				result*=N;
			}
			N--;
		}
		System.out.print(result);

	}

}
