package com.monocept.structural.flyweight.model;

//intrinsic state

public class TreeType {
	private String name;
	private String color;
	private String texture;

	public TreeType(String name, String color, String texture) {
		super();
		this.name = name;
		this.color = color;
		this.texture = texture;
	}

	public void plantTree(int x, int y) {
		System.out.println(name + " Tree with " + color + " Color and " + texture
				+ " Texture is inserted at the position X : " + x + " and Position Y : " + y);
	}
}
