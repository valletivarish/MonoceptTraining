package com.monocept.arrays;

import java.util.Scanner;

public class SecondMaximum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=scanner.nextInt();
		int array[]=new int[n];
		int max=0;
		int secondMax=0;
		System.out.println("Enter elements of array: ");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			if(array[i]>max) {
				secondMax=max;
				max=array[i];
			}
			else if(array[i]>secondMax && array[i]!=max) {
				secondMax=array[i];
			}
		}
		System.out.println("Second maximum number of array: "+secondMax);
	}

}
