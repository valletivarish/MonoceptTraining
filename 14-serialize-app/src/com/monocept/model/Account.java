package com.monocept.model;

import java.io.Serializable;

public class Account implements Serializable{
    private long accountNumber;
    private String accountName;
    private double accountBalance;

    @Override
    public String toString() {
        return "Account Number = " + accountNumber + "\nAccount Name = " + accountName + "\nAccount Balance = " + accountBalance;
    }

    public void credit(long amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount to credit.");
            return;
        }
        this.accountBalance += amount;
        System.out.println("Current Balance : " + this.accountBalance);
    }

    public void debit(long amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount to debit.");
            return;
        }
        this.accountBalance -= amount;
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