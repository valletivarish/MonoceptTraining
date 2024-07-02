package com.monocept.structural.adaptar.test;

import java.util.List;
import java.util.Scanner;

import com.monocept.structural.adaptar.model.Biscuit;
import com.monocept.structural.adaptar.model.Chocolate;
import com.monocept.structural.adaptar.model.Hat;
import com.monocept.structural.adaptar.model.HatAdapter;
import com.monocept.structural.adaptar.model.IItems;
import com.monocept.structural.adaptar.model.ShoppingItems;

public class CartTest {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		ShoppingItems shoppingItems=new ShoppingItems();
		boolean exit=false;
		while(!exit) {
			System.out.println("Choose options : \n1. add Items \n2. display Cart \n3. Exit");
			int choice =scanner.nextInt();
			switch(choice) {
			case 1:
				addItem(shoppingItems,scanner);
				break;
			case 2:
				displayCart(shoppingItems);
				break;
			case 3:
				exit=true;
			}
			
		}

	}

	private static void displayCart(ShoppingItems shoppingItems) {
		shoppingItems.displayCart();
		
	}

	private static void addItem(ShoppingItems shoppingItems, Scanner scanner) {
		System.out.println("Available items : \n1. Biscuit \n2. Chocolate \n3. Hat");
		int option=scanner.nextInt();
		switch(option) {
		case 1:
			shoppingItems.addItems(new Biscuit("Oreo",20));
			break;
		case 2:
			shoppingItems.addItems(new Chocolate("Silk",80));
			break;
		case 3:
			shoppingItems.addItems(new HatAdapter(new Hat("Cap","Basket Ball",500,10)));
			
		}
		
	}

}
