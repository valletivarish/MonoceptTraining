package com.monocept.structural.facade.model;

public class ChineseMenu implements IMenu {

	@Override
	public void displayMenu() {
		System.out.println("\nIndian-Chinese:");
		System.out.println("Vegetarian:");
		System.out.println("1. Veg Manchurian");
		System.out.println("2. Hakka Noodles");
		System.out.println("3. Paneer Chilli");

		System.out.println("\nNon-Vegetarian:");
		System.out.println("4. Chicken Manchurian");
		System.out.println("5. Szechwan Prawns");
		System.out.println("6. Chilli Chicken");


	}

}
