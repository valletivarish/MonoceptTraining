package com.monocept.typecasting;

public class Test {

	public static void main(String[] args) {
		int number=10;
		double number2=number;
		System.out.println(number2);
		double number3=10.5;
		int number4=(int)number3;
		System.out.println(number4);
		byte number7=10;
		byte number8=-24;
		byte multiplication;
		multiplication=(byte) (number7*number8);
		System.out.println(multiplication);

	}

}
