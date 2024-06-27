package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,25,30,40,50);
		System.out.println("Orginal list : ");
		numbers.stream()
		.forEach((x)->System.out.println(x+5));

		System.out.println("Odd Numbers : ");
		numbers.stream()
		.filter((x)->x%2!=0)
		.forEach((x)->System.out.println(x));
		
		System.out.println("Even Numbers");
		List<Integer> evenNumbers=numbers.stream()
				.filter((x)->x%2==0)
				.collect((Collectors.toList()));
		evenNumbers.stream()
		.forEach(x->System.out.println(x));
		
		System.out.println("Addition: "+numbers.stream().reduce(0,(sum,x)->sum+x));
		
		System.out.println("Multiplication : ");
		List<Integer> multipliers=numbers
				.stream().map((x)->(x*5))
				.collect(Collectors.toList());
		multipliers.forEach((x)->System.out.println(x));
		System.out.println("Sorted : ");
		numbers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach((x)->System.out.println(x));
		
		
		
	}

}
