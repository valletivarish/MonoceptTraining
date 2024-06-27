package com.monocept.test;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class EmailVerificationTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Predicate<String> predicate=(email)->{
			String regex = "^[A-Za-z0-9.]+@[A-Za-z0-9.]+.[A-Za-z]{2,}$";
			return Pattern.matches(regex,email);
		};
		System.out.println("Enter the email : ");
		String email=scanner.next();
		if(!predicate.test(email)) {
			System.out.println("Email is invalid");
			System.exit(0);
		}
		System.out.println("Email is valid");

	}

}
