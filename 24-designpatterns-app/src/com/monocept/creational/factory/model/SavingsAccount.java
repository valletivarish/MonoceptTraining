package com.monocept.creational.factory.model;

public class SavingsAccount implements IAccount{
	private Long accountNumber;
	private String accountName;
	private Double accountBalance;
	@Override
	public void credit(Double amount) {
		System.out.println("amount credited :"+amount);
		this.accountBalance+=amount;
		
	}
	@Override
	public void debit(Double amount) {
		System.out.println("amount debited :"+amount);
		this.accountBalance-=amount;
		
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
