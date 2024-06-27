package com.monocept.creational.factory.model;

public class Mahindra implements ICar{

	@Override
	public void startCar() {
		System.out.println("Mahindra car started");
		
	}

	@Override
	public void stopCar() {
		System.out.println("Mahindra car stopped");
		
	}

}
