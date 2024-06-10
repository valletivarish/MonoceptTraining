package com.monocept.model;

public class SecurityCamera implements SmartDevice, Monitorable{
	public String deviceId;
	public String name;
	public boolean recording;
	
	public SecurityCamera(String deviceId, String name, boolean recording) {
		this.deviceId = deviceId;
		this.name = name;
		this.recording = recording;
	}

	@Override
	public String getStatus() {
		return "the device is "+this.recording;
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
		return this.recording;
	}

	public void setRecording(boolean turnOn) {
		this.recording=true;
		
	}

}
