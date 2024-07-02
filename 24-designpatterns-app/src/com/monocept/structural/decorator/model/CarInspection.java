package com.monocept.structural.decorator.model;

public class CarInspection implements ICarService {

	@Override
	public Double getCost() {

		return 1000.0;
	}

	@Override
	public String getDescription() {
		return "Car Service";
	}

}
