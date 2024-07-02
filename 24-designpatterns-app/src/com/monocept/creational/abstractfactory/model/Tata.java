package com.monocept.creational.abstractfactory.model;

public class Tata implements ICar{

	@Override
	public void start() {
		System.out.println("Tata car is started");
		
	}

	@Override
	public void stop() {
		System.out.println("Tata car is stopped");
		
	}

}
