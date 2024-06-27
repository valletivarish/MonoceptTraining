package com.monocept.isp.solution.model;

public class Labour implements IWorker{

	@Override
	public void eat() {
		System.out.println("Labour started working");
		
	}

	@Override
	public void drink() {
		System.out.println("Labour stopped working");
		
	}

	@Override
	public void startWork() {
		System.out.println("Labour starts eating");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Labour starts drinking");
		
	}

}
