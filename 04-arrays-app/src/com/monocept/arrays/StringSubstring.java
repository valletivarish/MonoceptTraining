package com.monocept.arrays;

import java.util.Scanner;

public class StringSubstring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the first string: ");
		String firstString=scanner.nextLine();
		System.out.println("Please enter the second string :");
		String secondString=scanner.nextLine();
		System.out.println(isSubString(firstString,secondString));
		
		
		

	}

	private static boolean isSubString(String firstString, String secondString) {
		int current=0;
		for(int i=0;i<firstString.length();i++) {
			if(firstString.charAt(i)==secondString.charAt(current)) {
				current++;
				if(current==secondString.length()) {
					return true;
				}
			}
			else {
				i-=current;
				current=0;
			}
		}
		return false;
	}


}
