package com.monocept.arrays;

import java.util.Scanner;

public class PickElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int array[];
        array = new int[n];
        System.out.println("Enter elemnts of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Result array: ");
        if (n==1) {
        	System.out.print(array[0]+" ");
        	
        }
        else {
        //checking the first element 
        if (array[0] > array[1]) {
        	System.out.print(array[0]+" ");

        }
        //iterating from second elemnt to last second element
        for (int j = 1; j < n - 1; j++) {
            if (array[j] > array[j - 1] && array[j] > array[j + 1]) {
            	System.out.print(array[j]+" ");
            }
        }
        //checking the last element
        if (array[n - 1] > array[n - 2] ){
        	System.out.print(array[n-1]+" ");

        }
        }
    }
}

