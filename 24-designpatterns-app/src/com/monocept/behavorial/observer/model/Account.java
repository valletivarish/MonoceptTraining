package com.monocept.behavorial.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	private List<INotifier> notifiers;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
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

	public Account(int accountNumber, String accountName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		this.notifiers = new ArrayList<INotifier>();
	}

	public void withdraw(double amount) {
		if (accountBalance > amount) {
			accountBalance -= amount;
		}
		for (INotifier notifier : notifiers) {
			notifier.notifyUser(this, amount, "Withdraw");
		}
	}

	public void deposit(double amount) {
		accountBalance += amount;
		for (INotifier notifier : notifiers) {
			notifier.notifyUser(this, amount, "Deposit");
		}
	}

	public void registerNotification(INotifier notifier) {
		for (INotifier notify : notifiers) {
			if (notify.getClass().equals(notifier.getClass())) {
				throw new NotifierExistingException("Already notifier existed");
			}
		}
		notifiers.add(notifier);
	}

	public void deRegisterNotification(INotifier notifier) {
		for(INotifier notify:notifiers) {
			if(notify.getClass().equals(notifier.getClass())) {
				notifiers.remove(notifier);
				return;
			}	
		}
		throw new NotifierExistingException("Cannot remove notifier which doesn't exist");
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + "]";
	}
}
