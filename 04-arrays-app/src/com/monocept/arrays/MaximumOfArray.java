package com.monocept.arrays;


import java.util.Arrays;
import java.util.Scanner;

public class MaximumOfArray {

	public static void main(String[] args) {
		int array[];
		int maxi=0;
		array=new int[10];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter elements of the array:");
		for(int i=0;i<array.length;i++) {
			int number=scanner.nextInt();
			array[i]=number;
			if(array[i]>maxi) {
				maxi=array[i];
			}
		}
		System.out.println("maximum of the array:"+maxi);
		System.out.println(Arrays.toString(array));
	}

}
