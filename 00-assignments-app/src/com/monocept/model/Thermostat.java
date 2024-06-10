package com.monocept.model;

public class Thermostat implements SmartDevice, Controllable,Monitorable{
	public String deviceId;
	public String name;
	public boolean on;
	public double temperature;
	

	public Thermostat(String deviceId, String name, boolean on, double temperature) {
		this.deviceId = deviceId;
		this.name = name;
		this.on = on;
		this.temperature = temperature;
	}

	@Override
	public String getStatus() {
		
		return "The device is "+this.on;
	}

	@Override
	public void turnOn() {
		this.on=true;
		
	}

	@Override
	public void turnOff() {
		this.on=false;
		
	}

	@Override
	public String getDeviceID() {
		return this.deviceId;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.on;
	}

}
