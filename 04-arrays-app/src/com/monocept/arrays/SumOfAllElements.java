package com.monocept.arrays;

import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		int array[];
		array=new int[10];
		int addition=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter elements of the array: ");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			addition+=array[i];
		}
		System.out.println("Addition:"+addition);
	}

}
