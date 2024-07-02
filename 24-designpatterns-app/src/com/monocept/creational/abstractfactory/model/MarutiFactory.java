package com.monocept.creational.abstractfactory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		return new Maruti();
	}

}
