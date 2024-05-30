package com.monocept.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class M2DNotDefinedColumns {

	public static void main(String[] args) {
		int array[][];
		array=new int[3][];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int m=scanner.nextInt();
			for(int j=0;j<m;j++) {
				array[i][j]=scanner.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(array));
	}

}
