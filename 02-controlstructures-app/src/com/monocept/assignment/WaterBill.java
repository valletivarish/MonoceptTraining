package com.monocept.assignment;

import java.util.Scanner;

public class WaterBill {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no of units consumed:");
		int units=scanner.nextInt();
		int meterCharge=75;
		int calculatedCharge=calculateWaterBill(units);
		int total_water_bill = 0;
		total_water_bill= meterCharge + calculatedCharge;
		System.out.println("Total water bill:"+total_water_bill);

	}

	private static int calculateWaterBill(int units) {
		if (units<=100) {
			return units*5;
		}
		if (units>100 && units<=250){
			return units*10;
		}
		return units*20;
	}

}
