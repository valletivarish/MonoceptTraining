package com.monocept.dip.solution.test;

import com.monocept.dip.solution.model.DBLogger;
import com.monocept.dip.solution.model.FileLogger;
import com.monocept.dip.solution.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {
		TaxCalculator t1=new TaxCalculator(new DBLogger());
		t1.calculateTax(200, 0);
		TaxCalculator t2=new TaxCalculator(new FileLogger());
		t2.calculateTax(2000, 0);

	}

}
