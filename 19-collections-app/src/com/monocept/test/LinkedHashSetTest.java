package com.monocept.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> set= new LinkedHashSet<String>();
		set.add("abc");
		set.add("lmn");
		set.add("xyz");
		System.out.println(set);

	}

}
