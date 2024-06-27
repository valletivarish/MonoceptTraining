package com.monocept.dip.solution.model;

public class TaxCalculator {
	ILogger ilogger;

	public ILogger getIlogger() {
		return ilogger;
	}

	public void setIlogger(ILogger ilogger) {
		this.ilogger = ilogger;
	}

	public TaxCalculator(ILogger ilogger) {
		super();
		this.ilogger = ilogger;
	}
	public void calculateTax(int amount,int rate) {
		try {
			int tax=amount/rate;
			System.out.println("Tax :"+tax);
		}
		catch(Exception e) {
		ilogger.log(e);
		}
	}
}
