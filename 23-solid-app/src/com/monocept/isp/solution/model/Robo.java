package com.monocept.isp.solution.model;

public class Robo implements IWorkable{

	@Override
	public void startWork() {
		System.out.println("Robo started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robo stopped working");
		
	}

}
