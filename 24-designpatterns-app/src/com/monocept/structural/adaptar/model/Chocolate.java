package com.monocept.structural.adaptar.model;

public class Chocolate implements IItems{
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Chocolate() {
		super();
	}

	public Chocolate(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getItems() {
		return this.name;
		
	}

	@Override
	public int getPrice() {
		return this.price;
		
	}

}
