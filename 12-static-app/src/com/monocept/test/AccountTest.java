package com.monocept.test;

import java.util.Scanner;
import com.monocept.model.Account;

public class AccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of accounts you want to create:");
        int numberOfAccounts = scanner.nextInt();
        Account[] accounts = new Account[numberOfAccounts];

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Enter Account Number for Account " + (i + 1) + ":");
            long accountNumber = scanner.nextLong();
            System.out.println("Enter Account Holder Name for Account " + (i + 1) + ":");
            String accountName = scanner.next();
            System.out.println("Enter Account Balance for Account " + (i + 1) + ":");
            double accountBalance = scanner.nextDouble();

            accounts[i] = new Account(accountNumber, accountName, accountBalance);
            System.out.println(accounts[i]);
        }
       System.out.println("Total Accounts created is"+accounts.length);
    }
}