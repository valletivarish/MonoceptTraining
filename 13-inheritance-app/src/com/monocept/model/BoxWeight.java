package com.monocept.model;

public class BoxWeight  extends Box{
	public double weight;

	public double getWeight() {
		return weight;
	}

	public BoxWeight() {
		super();
	}

	public BoxWeight(double width, double height, double depth, double weight) {
		super(width,height,depth);
		this.weight = weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
