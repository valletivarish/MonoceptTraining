package com.monocept.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(3, "rishi");
		map.put(2,"Tarun");
		map.put(4, "varish");
		map.put(1, "ajay");
		map.put(6,"shivamani");
		map.put(null, null);
		System.out.println(map.get(1));
		System.out.println(map);

	}

}
