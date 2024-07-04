package com.monocept.behavorial.observer.model;

public class SmsNotifier implements INotifier {

    @Override
    public void notifyUser(Account account, double amount, String transactionType) {
        System.out.println(transactionType + " transaction occurred with amount: " + amount);
        System.out.println("SMS Notification for transaction with account number " + account.getAccountNumber());
        System.out.println("Current balance: " + account.getAccountBalance());
        System.out.println("-----------");
    }
}
