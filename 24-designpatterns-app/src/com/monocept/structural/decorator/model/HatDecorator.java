package com.monocept.structural.decorator.model;

public class HatDecorator implements IHat{
	private IHat hat;
	public IHat getHat() {
		return hat;
	}
	public void setHat(IHat hat) {
		this.hat = hat;
	}
	public HatDecorator(IHat hat) {
		super();
		this.hat = hat;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return hat.getPrice();
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName();
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return hat.getDescription();
	}


}
