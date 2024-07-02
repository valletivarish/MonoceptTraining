package com.monocept.behavorial.strategydesignpattern.model;

public class AddOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		return a + b;
	}

	@Override
	public String description() {
		return "Add Operation";
	}

}
