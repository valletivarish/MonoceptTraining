package com.monocept.creational.factory.model;

public class CarFactory {
	private static ICar car;
	public static ICar  getCar(String carName) {
		if(carName=="Maruthi")
			car=new Maruthi();
		if(carName=="Tata")
			car=new Tata();
		if(carName=="Mahindra")
			car=new Mahindra();
		return car;
	}
	
}
