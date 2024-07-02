package com.monocept.structural.decorator.model;

public class OilChange extends CarServiceDecorator{
	
	public OilChange(CarInspection carInspection) {
		super(carInspection);
	}
	
	@Override
	public Double getCost() {
		return carService.getCost()+400;
	}

	@Override
	public String getDescription() {
		return carService.getDescription() + " with oil change";
	}

}
