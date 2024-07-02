package com.monocept.creational.observer.model;

public interface INotifier {
    void notifyUser(Account account, double amount, String transactionType);
}
