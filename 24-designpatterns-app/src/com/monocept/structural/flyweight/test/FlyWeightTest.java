package com.monocept.structural.flyweight.test;

import java.util.ArrayList;

import com.monocept.structural.flyweight.model.Tree;
import com.monocept.structural.flyweight.model.TreeFactory;
import com.monocept.structural.flyweight.model.TreeType;

public class FlyWeightTest {

	public static void main(String[] args) {
		ArrayList<Tree> virtualGame = new ArrayList<Tree>();
		TreeFactory treeFactory = new TreeFactory();

		TreeType okaTree = treeFactory.getTreeType("Oak", "Green", "Rough");
		TreeType pineTree = treeFactory.getTreeType("Pine", "Green", "Smooth");

		virtualGame.add(new Tree(getPositionX(), getPositionY(), okaTree));
		virtualGame.add(new Tree(getPositionX(), getPositionY(), pineTree));
		virtualGame.add(new Tree(getPositionX(), getPositionY(), okaTree));
		virtualGame.add(new Tree(getPositionX(), getPositionY(), pineTree));

		for (Tree tree : virtualGame) {
			tree.plantTree();
			System.out.println("-------------------------------------------------------");
		}

	}

	private static int getPositionY() {
		return (int) (Math.random() * 100);
	}

	private static int getPositionX() {
		return (int) (Math.random() * 100);
	}

}
