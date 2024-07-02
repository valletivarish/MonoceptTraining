package com.monocept.structural.decorator.model;

public class PremiumHat implements IHat{

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 120.0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "premium hat";
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "its a premium hat";
	}

}
