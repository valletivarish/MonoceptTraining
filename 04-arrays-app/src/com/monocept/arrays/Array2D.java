package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int array[][];
		array=new int[3][3];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				array[i][j]=scanner.nextInt();
		System.out.print("Array :"+Arrays.deepToString(array));
	}

}
