package com.monocept.structural.decorator.model;

public class WheelAlignment extends CarServiceDecorator {

	public WheelAlignment(ICarService carService) {
		super(carService);
	}

	@Override
	public Double getCost() {
		return carService.getCost() + 500;
	}

	@Override
	public String getDescription() {
		return carService.getDescription() + " with wheel alignment";
	}

}
