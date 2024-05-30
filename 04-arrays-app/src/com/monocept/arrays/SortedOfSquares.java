package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortedOfSquares {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int array[];
		array=new int[5];
		System.out.println("Enter elements in sorted way");
		//array=[-3,-2,-1,0,1]
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
			array[i]=array[i]*array[i];
		}
		//array=[9,4,1,0,1]
		int left=0;
		int right=array.length - 1;
		int i=array.length-1;
		int sortedArr[];
		sortedArr=new int[5];
		//sortedArr=[0,0,0,0,0]
		while(left<=right) {
			if(array[left]>array[right]) {
				sortedArr[i]=array[left];
				left++;
			}
			else {
				sortedArr[i]=array[right];
				right--;
			}
			i--;
		}
		System.out.println("Sorted Array: "+Arrays.toString(sortedArr));
	}

}
