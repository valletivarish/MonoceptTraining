package com.monocept.model;

public class Account {
    private static int accountCount = 0;
    private long accountNumber;
    private String accountName;
    private double accountBalance;

    public Account(long accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        accountCount++;
        System.out.println("Account "+accountCount+" created successfully!");
    }

    public static int getAccountCount() {
        return accountCount;
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

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n" +
               "Account Holder Name: " + accountName + "\n" +
               "Account Balance: " + accountBalance + "\n";
    }
}
	
	
	
