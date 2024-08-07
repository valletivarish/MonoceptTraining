package com.monocept.model;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		System.out.println("enter no of rows : ");
		int n=scanner.nextInt();
		System.out.println("enter no of columns  :" );
		int m=scanner.nextInt();
		int matrix[][]=new int[n][m];
		System.out.println("Enter elements of matrix : ");
		
		createRows(matrix,scanner,n,m);
		
		displayMatrix(matrix,n,m);
		

	}

	private static void displayMatrix(int[][] matrix,int n, int m) {
		for(int i=0;i<n;i++) {
			displayInnerMatrix(i,matrix,n,m);
		}
		
	}

	private static void displayInnerMatrix(int i, int[][] matrix, int n, int m) {
		for(int j=0;j<m;j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}

	private static void createRows(int[][] matrix, Scanner scanner, int n , int m) {
		for(int i=0;i<n;i++) {
			createColumns(i,matrix,scanner, n, m);
		}
		
	}

	private static void createColumns(int i, int[][] matrix, Scanner scanner, int n, int m) {
		for(int j=0;j<m;j++) {
			matrix[i][j]=scanner.nextInt();
		}
		
	}

}
