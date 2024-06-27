package com.monocept.creational.factory.model;

public class Tata implements ICar{

	@Override
	public void startCar() {
		System.out.println("Tata car started");
		
	}

	@Override
	public void stopCar() {
		System.out.println("Tata car stopped");
		
	}

}
