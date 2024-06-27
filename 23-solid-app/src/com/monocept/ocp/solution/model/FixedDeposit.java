package com.monocept.ocp.solution.model;

import com.monocept.ocp.violation.model.FestivalType;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private double duration;
	private double rate;
	public FixedDeposit() {
		super();
	}
	public FixedDeposit(int accountNumber, String name, double principle, double duration) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principle;
		this.duration = duration;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrincipal() {
		return principal;
	}
	public void setPrinciple(double principal) {
		this.principal = principal;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
