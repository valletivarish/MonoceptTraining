package com.monocept.creational.abstractfactory.model;

public class TataFactory implements ICarFactory{

	@Override
	public ICar makeCar() {
		return new Tata();
		
	}

}
