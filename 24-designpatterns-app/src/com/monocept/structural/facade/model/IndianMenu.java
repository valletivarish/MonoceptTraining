package com.monocept.structural.facade.model;

public class IndianMenu implements IMenu {

	@Override
	public void displayMenu() {
		System.out.println("Indian:");
		System.out.println("Vegetarian:");
		System.out.println("1. Idli");
		System.out.println("2. Masala Dosa");
		System.out.println("3. Samosa");
		System.out.println("4. Paneer Tikka");
		System.out.println("5. Aloo Gobi");

		System.out.println("\nNon-Vegetarian:");
		System.out.println("6. Butter Chicken");
		System.out.println("7. Chicken Biryani");
		System.out.println("8. Rogan Josh (Lamb)");
		System.out.println("9. Fish Curry");

	}

}
