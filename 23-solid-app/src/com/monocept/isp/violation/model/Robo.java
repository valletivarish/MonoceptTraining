package com.monocept.isp.violation.model;

public class Robo implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robo started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robo stopped working");
		
	}

	@Override
	public void eat() {
		System.out.println("");
		
	}

	@Override
	public void drink() {
		System.out.println();
		
	}
	
}
