package com.monocept.assignment;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to Treasure Island Your mission is to find the treasure");
		System.out.println("Choose either right or left:");
		String direction=scanner.nextLine();
		checkPathToTheTreasure(direction,scanner);

	}

	private static void checkPathToTheTreasure(String direction,Scanner scanner) {
		if(direction.equalsIgnoreCase("right")) {
			System.out.println("Fall into a hole.");
			System.out.println("Game Over.");
			return;
		}
		System.out.println("Choose either to swim or wait");
		String action=scanner.nextLine();
		checkAction(action,scanner);
		
	}

	private static void checkAction(String action, Scanner scanner) {
		if(action.equalsIgnoreCase("swim")) {
			System.out.println("Attacked by trout.");
			System.out.println("Game Over.");
			return;
		}
		System.out.println("Choose a door:");
		String door=scanner.nextLine();
		checkDoor(door,scanner);
		
	}

	private static void checkDoor(String door, Scanner scanner) {
		if (door.equals("red") || door.equals("Red")) {
			System.out.println("Burned by Fire.");
			System.out.println("Game Over.");
			return;
		}
		if (door.equals("blue") || door.equals("Blue")) {
			System.out.println("Eaten by beasts.");
			System.out.println("Game Over.");
			return;
		}
		if (door.equals("yellow") || door.equals("Yellow")) {
			System.out.println("You Win!");
			return;
		}
		System.out.println("Game Over.");
	}

}
