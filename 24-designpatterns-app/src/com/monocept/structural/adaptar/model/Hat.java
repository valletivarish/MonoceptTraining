package com.monocept.structural.adaptar.model;

public class Hat {
	private String shortName;
	private String LongName;
	private int basePrice;
	private int tax;
	public Hat() {
		super();
	}
	public Hat(String shortName, String longName, int basePrice, int tax) {
		super();
		this.shortName = shortName;
		LongName = longName;
		this.basePrice = basePrice;
		this.tax = tax;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return LongName;
	}
	public void setLongName(String longName) {
		LongName = longName;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
}
