package com.monocept.behavorial.strategydesignpattern.model;

public class OperationStrategy implements IOperation{
	private IOperation operation;
	public OperationStrategy(IOperation operation) {
		this.operation=operation;
	}
	@Override
	public int doOperation(int a, int b) {
		return operation.doOperation(a, b);
	}
	@Override
	public String description() {
		return operation.description();
	}

}
