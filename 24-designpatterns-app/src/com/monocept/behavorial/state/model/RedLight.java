package com.monocept.behavorial.state.model;

public class RedLight implements State {

	@Override
	public void changeLight(TrafficLight trafficLight) {
		System.out.println("State : Red Light");
		trafficLight.setState(new GreenLight());

	}

}
