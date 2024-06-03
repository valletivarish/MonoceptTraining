package com.monocept.model;

public class AccountCurrent extends Account {
    private static final int OVERDRAFT_LIMIT = 50000;

    public boolean validateOverDraft(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount to debit.");
            return false;
        }
        if (amount > OVERDRAFT_LIMIT + getAccountBalance()) {
            System.out.println("Your account balance is exceeding the limit");
            return false;
        }
        debit(amount);
        return true;
    }
}
