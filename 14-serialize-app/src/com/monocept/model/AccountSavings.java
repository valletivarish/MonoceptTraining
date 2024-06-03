package com.monocept.model;

public class AccountSavings extends Account {
    private static final int MINIMUM_BALANCE = 5000;

    public boolean validateMinimumBalance(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount to debit.");
            return false;
        }
        if (getAccountBalance() - amount < MINIMUM_BALANCE) {
            System.out.println("Please maintain the minimum balance");
            return false;
        }
        debit(amount);
        return true;
    }
}
