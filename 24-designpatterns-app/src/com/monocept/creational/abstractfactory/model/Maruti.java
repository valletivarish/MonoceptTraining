package com.monocept.creational.abstractfactory.model;

public class Maruti implements ICar{

	@Override
	public void start() {
		System.out.println("Maruti car is started");
		
	}

	@Override
	public void stop() {
		System.out.println("Maruti car is stopped");
		
	}

}
