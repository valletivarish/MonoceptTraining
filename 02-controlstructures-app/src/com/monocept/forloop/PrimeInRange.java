package com.monocept.forloop;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range1 : ");
		int range1=scanner.nextInt();
		System.out.println("Enter the range2 : ");
		int range2=scanner.nextInt();
		int[] primes=new int[range2];
		int primeIndex=0;
		
		for (int i=range1;i<=range2;i++) {
			boolean flag=false;
			if(i<2) {
				flag=true;
			}
			else {
			for(int j=2;j<=i/2;j++) {
				if (i%j==0) {
					flag=true;
					break;
					
				}
			}
			if (flag==false) {
				primes[primeIndex]=i;
				primeIndex++;
			}
		}
		
		}
		
		int index=0;
		int rowCount=1;
		while(index<primeIndex) {
			for(int i=0;i<rowCount;i++) {
				System.out.print(primes[index]+"\t");
				index++;
			}
			System.out.println();
			rowCount++;
		}
		
	}

}
