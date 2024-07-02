package com.monocept.structural.adaptar.model;

public class HatAdapter implements IItems{

	Hat hat;
	@Override
	public String getItems() {

		return hat.getLongName()+" "+hat.getShortName();
	}

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return hat.getBasePrice()+((hat.getTax()*hat.getBasePrice())/100);
	}

}
