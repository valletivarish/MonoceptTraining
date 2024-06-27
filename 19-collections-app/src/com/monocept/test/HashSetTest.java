package com.monocept.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("abc");
		set.add("lmn");
		set.add("xyz");
		set.add(null);
		System.out.println(set);
	}

}
