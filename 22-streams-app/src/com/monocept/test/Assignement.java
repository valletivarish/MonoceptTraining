package com.monocept.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Assignement {

	public static void main(String[] args) {
		List<String> name=Arrays.asList("Jayesh","Nimesh","Mark","Mahesh","Ramesh");
		System.out.println("Orginal :");
		name.stream()
		.forEach(x->System.out.println(x));
		System.out.println("first 3 students sorted in ascending order :");
		name.stream()
		.sorted()
		.limit(3)
		.forEach(x->System.out.println(x));
		System.out.println("first 3 students sorted in ascending order if it contains 'a' : ");
		name.stream()
		.filter(x->x.contains("a"))
		.sorted()
		.limit(3)
		.forEach(x->System.out.println(x));
		System.out.println("students in descnding order : ");
		name.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(x->System.out.println(x));
		System.out.println("first 3 characters of all names :");
		name.stream()
		.map(x->x.substring(0,3))
		.forEach(x->System.out.println(x));
		System.out.println("names of the students that contains less than or equal to 4 characters : ");
		name.stream()
		.filter((x)->x.length()<=4)
		.forEach(x->System.out.println(x));
		
	}

}
