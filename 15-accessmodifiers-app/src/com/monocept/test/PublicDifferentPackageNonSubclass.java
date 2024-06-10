package com.monocept.test;

import com.monocept.model.Public;

public class PublicDifferentPackageNonSubclass {
	public static void main(String args[]) {
		Public obj=new Public();
		System.out.println("Public : Inside Different package and non sub class");
		int number1=obj.number;
		System.out.println("Number1  : "+number1);
	}
}
