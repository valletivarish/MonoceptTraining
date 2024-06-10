package com.monocept.test;

import java.util.Scanner;

public class DisivionTest {

	public static void main(String[] args) {

		
		try {
//			Scanner scanner=new Scanner(System.in);
//			System.out.println("Enter number1 :");
			int number1=Integer.parseInt(args[0]);
//			System.out.println("Enter number2 :");
			int number2=Integer.parseInt(args[1]);
			double division=number1/number2;
			System.out.println("Divsion : "+division);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot be divided by zero.... please give a another number ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("all input values are not available");
		}
		catch(NumberFormatException e) {
			System.out.println("the input values should integer only");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("all executions handled");
		}	
	}

}
