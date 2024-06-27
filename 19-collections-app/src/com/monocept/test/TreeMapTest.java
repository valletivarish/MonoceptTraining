package com.monocept.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<Integer,String>();
		map.put(3, "rishi");
		map.put(2,"Tarun");
		map.put(4, "varish");
		map.put(1, "ajay");
		map.put(6,"shivamani");
		Set<Map.Entry<Integer,String>> entries=map.entrySet();
		for(Map.Entry entry:entries) {
			System.out.println("key : "+entry.getKey()+" and Value : "+entry.getValue());
		}
//		System.out.println(map);

	}

}
