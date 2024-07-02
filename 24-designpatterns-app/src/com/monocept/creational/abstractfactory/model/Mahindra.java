package com.monocept.creational.abstractfactory.model;

public class Mahindra implements ICar{

	@Override
	public void start() {
		System.out.println("Mahindra car is started");
		
	}

	@Override
	public void stop() {
		System.out.println("Mahindra car is stopped");
		
	}

}
