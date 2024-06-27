package com.monocept.test;

import com.monocept.model.ITester;

public class Tester {

	public static void main(String[] args) {
		ITester tester=()-> {
			System.out.println("Testing");	
		};
		tester.test();


	}

}
