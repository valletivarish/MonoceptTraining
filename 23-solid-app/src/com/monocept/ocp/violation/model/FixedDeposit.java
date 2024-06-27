package com.monocept.ocp.violation.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principle;
	private double duration;
	private FestivalType festival;
	private double rate;
	public FixedDeposit() {
		super();
	}
	public FixedDeposit(int accountNumber, String name, double principle, double duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
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
	public double getPrinciple() {
		return principle;
	}
	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public FestivalType getFestival() {
		return festival;
	}
	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}
	public double getInterestRate() {
		if (festival.equals(FestivalType.NEWYEAR)){
				return 8;
		}
		if (festival.equals(FestivalType.DIWALI)){
			return 8.5;
		}
		if (festival.equals(FestivalType.HOLI)){
			return 7.5;
		}
		return 6.5;
	}
	public double calculateSimpleInterest() {
		return (principle*getInterestRate()*duration)/100;
	}
}
