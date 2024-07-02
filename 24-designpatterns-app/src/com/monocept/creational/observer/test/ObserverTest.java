package com.monocept.creational.observer.test;

import com.monocept.creational.observer.model.Account;
import com.monocept.creational.observer.model.EmailNotifier;
import com.monocept.creational.observer.model.SmsNotifier;

public class ObserverTest {
    public static void main(String[] args) {
        System.out.println("First Account:");
        Account account1 = new Account(1, "Varish", 20000);
        account1.registerNotification(new EmailNotifier());
        account1.registerNotification(new EmailNotifier());
        account1.registerNotification(new EmailNotifier());
        account1.registerNotification(new EmailNotifier());
        account1.registerNotification(new SmsNotifier());
        account1.registerNotification(new SmsNotifier());
        account1.registerNotification(new SmsNotifier());
        account1.withdraw(1000);

        System.out.println("\nSecond Account:");
        Account account2 = new Account(2, "John", 10000);
        account2.registerNotification(new EmailNotifier());
        account2.registerNotification(new SmsNotifier());
        account2.deposit(1000);
    }
}
