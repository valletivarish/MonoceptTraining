package com.monocept.debug;

public class AverageCalculator {

	public static void main(String[] args) {
		int number1=10;
		int number2=20;
		int sum = Addition(number1,number2);
		double average=CalculateAverage(sum);
		System.out.println("Average: "+average);

	}
	private static int Addition(int number1,int number2) {
		System.out.println("Inside Addition method");
		System.out.println("Inside Addition2 method");
		return number1+number2;
	}
	private static double CalculateAverage(int sum) {
		System.out.println("Inside Average method");
		return sum/2;
	}

}
