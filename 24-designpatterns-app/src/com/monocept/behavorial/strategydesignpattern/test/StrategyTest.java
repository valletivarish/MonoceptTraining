package com.monocept.behavorial.strategydesignpattern.test;

import com.monocept.behavorial.strategydesignpattern.model.AddOperation;
import com.monocept.behavorial.strategydesignpattern.model.MultiplicationOperation;
import com.monocept.behavorial.strategydesignpattern.model.OperationStrategy;

public class StrategyTest {

	public static void main(String[] args) {
		OperationStrategy operationStrategy = new OperationStrategy(new AddOperation());
		System.out.println(operationStrategy.description());
		System.out.println(operationStrategy.doOperation(10, 20));
		System.out.println("-----------------------------------");
		operationStrategy = new OperationStrategy(new MultiplicationOperation());
		System.out.println(operationStrategy.description());
		System.out.println(operationStrategy.doOperation(10, 20));
		System.out.println("-----------------------------------");

	}

}
