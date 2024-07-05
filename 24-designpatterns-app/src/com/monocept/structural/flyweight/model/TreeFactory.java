package com.monocept.structural.flyweight.model;

//flyweight factory

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

	private static Map<String, TreeType> treeMap = new HashMap<>();

	public TreeType getTreeType(String name, String color, String texture) {
		String key = name + " " + color + " " + texture;
		TreeType result = treeMap.get(key);
		if (result == null) {
			result = new TreeType(name, color, texture);
			treeMap.put(key, result);
		}
		return result;

	}
}
