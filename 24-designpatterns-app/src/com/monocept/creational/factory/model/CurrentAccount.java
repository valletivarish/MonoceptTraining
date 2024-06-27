package com.monocept.creational.factory.model;

public class CurrentAccount implements IAccount{
	private long accountNumber;
	private Double overDraft;
	@Override
	public void credit(Double amount) {
		System.out.println("Amount Credited :" + amount);
		
	}
	@Override
	public void debit(Double amount) {
		if(amount>overDraft) {
			System.out.println("Amount cannot be Debited");
			return;
		}
		System.out.println("Amount debited : "+amount);
		this.overDraft-=amount;	
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(Double overDraft) {
		this.overDraft = overDraft;
	}
	

}
