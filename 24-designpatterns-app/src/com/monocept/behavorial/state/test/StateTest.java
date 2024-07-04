package com.monocept.behavorial.state.test;

import com.monocept.behavorial.state.model.RedLight;
import com.monocept.behavorial.state.model.State;
import com.monocept.behavorial.state.model.TrafficLight;

public class StateTest {

	public static void main(String[] args) {
		TrafficLight trafficLight=new TrafficLight(new RedLight());
		trafficLight.changeLight();
		trafficLight.changeLight();

	}

}
