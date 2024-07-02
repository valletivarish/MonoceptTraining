package com.monocept.structural.decorator.model;

public abstract class CarServiceDecorator implements ICarService {
	public ICarService carService;

	public CarServiceDecorator(ICarService carService) {
		super();
		this.carService = carService;
	}

	@Override
	public Double getCost() {
		return carService.getCost();
	}

	@Override
	public String getDescription() {
		return carService.getDescription();
	}

}
