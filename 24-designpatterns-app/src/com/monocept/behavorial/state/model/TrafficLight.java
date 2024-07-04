package com.monocept.behavorial.state.model;

public class TrafficLight {
	State state;

	public TrafficLight(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void changeLight() {
		state.changeLight(this);
	}
}
