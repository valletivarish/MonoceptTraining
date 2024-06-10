package com.monocept.model;

public class Light implements SmartDevice,Controllable{
	public String deviceId;
	public String name;
	public boolean on;
	
	public Light(String deviceId, String name, boolean on) {
		this.deviceId = deviceId;
		this.name = name;
		this.on = on;
	}

	public Light() {
		// TODO Auto-generated constructor stub
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
		return this.on;
	}

}
