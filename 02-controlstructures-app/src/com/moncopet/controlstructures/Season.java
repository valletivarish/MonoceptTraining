package com.moncopet.controlstructures;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month=scanner.nextInt();
		switch(month){
			case 12:
			case 1:
			case 2: System.out.println("Winter");
			break;
			case 3:
			case 4:
			case 5: System.out.println("Summer");
			break;
			case 6: 
			case 7:
			case 8: System.out.println("Monsoon");
			break;
			case 9:
			case 10:
			case 11: System.out.println("Post-monsoon");
		}

	}

}
