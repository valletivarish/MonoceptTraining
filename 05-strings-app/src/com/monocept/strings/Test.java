package com.monocept.strings;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		StringBuffer middleName=new StringBuffer("Techlabs");
		StringBuilder lastName=new StringBuilder("Mumbai");
		String firstName=new String("Swabhav");
		
		concat1(middleName);
		System.out.println(middleName);
		concat2(lastName);
		System.out.println(lastName);
		concat3(firstName);
		System.out.println(firstName);

	}

	private static void concat3(String firstName) {
		firstName=firstName+"1";
		System.out.println(firstName);
		
	}

	private static void concat2(StringBuilder lastName) {
		lastName=lastName.append("2");
		
	}

	private static void concat1(StringBuffer middleName) {
		middleName=middleName.append("3");
		
	}

}
