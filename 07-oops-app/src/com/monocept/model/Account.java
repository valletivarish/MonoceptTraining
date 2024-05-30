package com.monocept.model;
public class Account {
	private long accountNumber;
	private String accountType;
	private String accountName;
	private double accountBalance;
	public void setAccountNumber(long accountnumber) {
		accountNumber=accountnumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountType(String accounttype) {
		accountType=accounttype;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountName(String accountname) {
		accountName=accountname;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountBalance(double accountbalance) {
		accountBalance=accountbalance;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
}
