package com.monocept.test;

import com.monocept.model.Public;

public class PublicDifferentPackageSubclass extends Public{
	public static void main(String args[]) {
		PublicDifferentPackageSubclass obj=new PublicDifferentPackageSubclass();
		int number1=obj.number;
		System.out.println("Public : Inside Different Package but sub class");
		System.out.println("Number1 : "+number1);	
	}
}
