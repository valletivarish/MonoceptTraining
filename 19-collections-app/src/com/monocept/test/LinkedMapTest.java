package com.monocept.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(3, "rishi");
		map.put(2,"Tarun");
		map.put(4, "varish");
		map.put(1, "ajay");
		map.put(6,"shivamani");
		System.out.println(map);

	}

}
