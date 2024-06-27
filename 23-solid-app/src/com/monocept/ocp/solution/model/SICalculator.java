package com.monocept.ocp.solution.model;

public class SICalculator {
	FixedDeposit fixedDeposit;
	public SICalculator(FixedDeposit fixedDeposit) {
		super();
		this.fixedDeposit = fixedDeposit;
	}
	public double calculateSimpleInterest(FestivalType festival) {
		return (fixedDeposit.getPrincipal()*fixedDeposit.getDuration()*festival.getInterestRate())/100;
	}
}
