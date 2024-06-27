package com.monocept.test;

import com.monocept.model.IFactorial;

public class FactorialTester {

	public static void main(String[] args) {
		System.out.print(function((int n)->{
			int prod=1;
			for(int i=1;i<=n;i++) {
				prod*=i;
			}
			return prod;
		}));
		

	}

	private static int function(IFactorial fact) {
		return fact.factorial(5);
		
	}

}
