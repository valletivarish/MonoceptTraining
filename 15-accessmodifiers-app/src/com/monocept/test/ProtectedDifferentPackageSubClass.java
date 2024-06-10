package com.monocept.test;

import com.monocept.model.Protected;

public class ProtectedDifferentPackageSubClass extends Protected{
	public static void main(String args[]) {
		ProtectedDifferentPackageSubClass obj =new ProtectedDifferentPackageSubClass();
		int number1=obj.number;
		System.out.println("Protected : Different package sub class");
		System.out.println("number1 : "+number1);
		
	}
}
