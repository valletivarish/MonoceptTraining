package com.monocept.behavorial.comand.model;

public class Television {
	private boolean status;

	public Television() {
		super();
		this.status = false;
	}

	public String isStatus() {
		return "status of the TV is "+status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void on() {
		status = true;
	}

	public void off() {
		status = false;
	}
}
