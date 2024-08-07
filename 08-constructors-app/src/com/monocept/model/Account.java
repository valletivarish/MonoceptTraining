package com.monocept.model;

public class Account {
	long accountNumber;
	String accountType;
	String accountName;
	double accountBalance;
	
	
	public Account() {
		accountNumber=0;
		accountType="savings";
		accountName="user";
		accountBalance=0.0;
	}
	
	public Account(long accountnumber, String accounttype, String accountname, double accountbalance) {
		accountNumber=accountnumber;
		accountType=accounttype;
		accountName=accountname;
		accountBalance=accountbalance;
	}
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
