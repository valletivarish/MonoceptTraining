package com.monocept.structural.flyweight.model;

//extrinsic state

public class Tree {
	private int x;
	private int y;
	private TreeType treeType;

	public Tree(int x, int y, TreeType treeType) {
		super();
		this.x = x;
		this.y = y;
		this.treeType = treeType;
	}

	public void plantTree() {
		treeType.plantTree(x, y);
	}
}
