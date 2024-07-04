package com.monocept.behavorial.observer.model;

public interface INotifier {
    void notifyUser(Account account, double amount, String transactionType);
}
