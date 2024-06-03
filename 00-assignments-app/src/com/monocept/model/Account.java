package com.monocept.model;

public class Account {
    private long accountNumber;
    private String accountName;
    private double accountBalance;

    @Override
    public String toString() {
        return "Account Number = " + accountNumber + "\nAccount Name = " + accountName + "\nAccount Balance = " + accountBalance;
    }

    public void credit(long amount) {
        this.accountBalance += amount;
        System.out.println("Amount is Credited.");
        System.out.println("Your Balance is : " + this.accountBalance);
    }

    public Account() {
		super();
	}

	public Account(long accountNumber, String accountName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public void debit(long amount) {
        this.accountBalance -= amount;
        System.out.println("Amount is Debited");
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
