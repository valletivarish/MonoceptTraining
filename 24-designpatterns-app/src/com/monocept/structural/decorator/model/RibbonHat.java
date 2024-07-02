package com.monocept.structural.decorator.model;

public class RibbonHat extends HatDecorator{

	public RibbonHat(IHat hat) {
		super(hat);
		
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 300+this.getHat().getPrice();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "ribbon "+this.getHat().getName();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.getHat().getDescription()+" its a ribbon";
	}
	
}
