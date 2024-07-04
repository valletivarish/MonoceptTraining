package com.monocept.behavorial.state.model;

public class GreenLight implements State {

	@Override
	public void changeLight(TrafficLight trafficLight) {
		System.out.println("State : Green Light");
		trafficLight.setState(new RedLight());

	}

}
