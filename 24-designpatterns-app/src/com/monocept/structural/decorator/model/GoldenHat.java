package com.monocept.structural.decorator.model;

public class GoldenHat extends HatDecorator{
	public GoldenHat(IHat hat) {
		super(hat);
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 200+this.getHat().getPrice();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "golden "+this.getHat().getName();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.getHat().getDescription()+" its a golden";
	}
	
}
