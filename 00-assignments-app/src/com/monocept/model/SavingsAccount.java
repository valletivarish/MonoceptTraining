package com.monocept.model;

public class SavingsAccount extends Account {
    private double minimumBalance;

    public SavingsAccount() {
		super();
	}

	public SavingsAccount(long accountNumber,String accountName,double accountBalance ,double minimumBalance) {
		super(accountNumber,accountName,accountBalance);
		this.minimumBalance = minimumBalance;
	}

	public boolean validateMinimumBalance(int amount) {
		if(getAccountBalance()<amount) {
			System.out.println("You don't have enough funds in your account.");
			return false;
		}
        if (getAccountBalance() - amount < minimumBalance) {
            System.out.println("Please maintain the minimum balance.");
            return false;
        }
        debit(amount);
        
        return true;
    }
}
