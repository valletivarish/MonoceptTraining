package com.monocept.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> predicate=(number)->{
			if(number%2==0) {
				return true;
			}
			return false;
		};
		if(!predicate.test(10)) {
			System.out.println("Number is odd ");
			System.exit(0);
		}
		System.out.println("Number is even");
		BiPredicate<Integer,Integer> bipredicate=(number1,number2)->{
			if(number1>number2) {
				return true;
			}
			return false;
		};
		if(!bipredicate.test(10,20)) {
			System.out.println("Number 2 is greater ");
			System.exit(0);
		}
		System.out.println("Number 1 is greater");
	}

}
