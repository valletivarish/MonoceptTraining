package com.monocept.test;

import com.monocept.model.IAddition;

public class additionTester {

	public static void main(String[] args) {
		IAddition adder=(int a,int b)->{
			return a+b;
		};
		adder.add(10,20);

	}

}
