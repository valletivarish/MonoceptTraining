package com.moncopet.controlstructures;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String grade=scanner.nextLine();
		switch(grade) {
		case "A": System.out.println("Excellent");
		break;
		case "B" : System.out.println("Good");
		break;
		case "C" :System.out.println("Needs Improvement");
		break;
		case "F" : System.out.println("Fail");
		break;
		}
		

	}

}
