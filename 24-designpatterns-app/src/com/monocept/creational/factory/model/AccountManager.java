package com.monocept.creational.factory.model;

public class AccountManager {
	private static IAccount account;
	public static IAccount getAccount(String accountType) {
		if(accountType=="Savings")
			account=new SavingsAccount();
		if(accountType=="Current")
			account=new CurrentAccount();
		return account;
	}
	
}
