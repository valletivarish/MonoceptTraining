package com.monocept.structural.facade.test;

import java.util.Scanner;

import com.monocept.structural.facade.model.HotelReception;

public class HotelTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HotelReception hotelReception=new HotelReception();
		boolean exit=false;
		while(!exit) {
			System.out.println("Restaurants : \n1. Indian \n2. Chinese");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("You choose Indian");
				hotelReception.getIndianMenu();
				break;
			case 2:
				System.out.println("You choose Chinese");
				hotelReception.getChineseMenu();
				break;
			case 3:
				exit=true;
				
			}
		}

	}

}
