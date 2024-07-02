package com.monocept.structural.decorator.model;

public class StandardHat implements IHat{

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100.0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "standard";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "its a standard hat";
	}

}
