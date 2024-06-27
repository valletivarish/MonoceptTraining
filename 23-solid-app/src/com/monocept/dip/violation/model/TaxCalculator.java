package com.monocept.dip.violation.model;

public class TaxCalculator {
	DBLogger dblogger;
	int tax;

	public TaxCalculator() {
		super();
		this.dblogger=new DBLogger();
	}
	public void calculateTax(int amount,int rate) {
		try {
			tax=amount/rate;
			System.out.println("Tax :"+tax);
		}
		catch(Exception e) {
			dblogger.log(e);
		}
		
	}
}
