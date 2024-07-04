package com.monocept.behavorial.observer.test;

import com.monocept.behavorial.observer.model.Account;
import com.monocept.behavorial.observer.model.EmailNotifier;
import com.monocept.behavorial.observer.model.NotifierExistingException;
import com.monocept.behavorial.observer.model.SmsNotifier;

public class ObserverTest {
    public static void main(String[] args) {
        
        try {
        	System.out.println("First Account:");
            Account account1 = new Account(1, "Varish", 20000);
            account1.registerNotification(new EmailNotifier());
//            account1.registerNotification(new EmailNotifier());
            account1.registerNotification(new SmsNotifier());
            account1.deRegisterNotification(new SmsNotifier());
            account1.withdraw(1000);


            System.out.println("\nSecond Account:");
            Account account2 = new Account(2, "John", 10000);
            account2.registerNotification(new EmailNotifier());
            account2.deRegisterNotification(new SmsNotifier());
            account2.deposit(1000);
        }
        catch(NotifierExistingException e) {
        	System.out.println(e.getMessage());
        }
    }
}
