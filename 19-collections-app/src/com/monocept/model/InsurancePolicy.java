package com.monocept.model;

import java.util.Date;

public class InsurancePolicy {
	private int policyNumber;
	private String policyHolderName;
	private int policyAmount;
	private Date policyCreationDate;
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public int getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}
	public Date getPolicyCreationDate() {
		return policyCreationDate;
	}
	@Override
	public String toString() {
		return "InsurancePolicy [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName
				+ ", policyAmount=" + policyAmount + ", policyCreationDate=" + policyCreationDate.getDate()+" "+policyCreationDate.getMonth()+" "+policyCreationDate.getYear() + "]";
	}
	public void setPolicyCreationDate(Date policyCreationDate) {
		this.policyCreationDate = policyCreationDate;
	}
	public InsurancePolicy(int policyNumber, String policyHolderName, int policyAmount, Date policyCreationDate) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
		this.policyCreationDate = policyCreationDate;
	}
	
}
