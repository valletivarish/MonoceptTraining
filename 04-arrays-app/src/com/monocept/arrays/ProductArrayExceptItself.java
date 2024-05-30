package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProductArrayExceptItself {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int array[];
		array=new int[4];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		int product=1;
		for(int j=0;j<array.length;j++) {
			product*=array[j];
		}
		for(int k=0; k<array.length;k++) {
			array[k]=product/array[k];
		}
		System.out.println("Result :"+Arrays.toString(array));
	}

}

////[2,3,4,5]
//int prefix=1;
//int resultArray[];
////[0,0,0,0]
//resultArray=new int[array.length];
//for(int j=0;j<array.length;j++) {
//	resultArray[j]=prefix;
//	prefix*=array[j];
//}
//
////postfix=1
//int postfix=1;
//for(int k=array.length-1;k>=0;k--) {
//	resultArray[k]*=postfix;
//	postfix*=array[k];
//}
//System.out.println("Result : "+Arrays.toString(resultArray));