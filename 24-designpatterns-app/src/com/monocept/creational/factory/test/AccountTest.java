package com.monocept.creational.factory.test;

import com.monocept.creational.factory.model.AccountManager;
import com.monocept.creational.factory.model.CurrentAccount;
import com.monocept.creational.factory.model.IAccount;
import com.monocept.creational.factory.model.SavingsAccount;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IAccount account = null;
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Choose options : \n1. Account Creation \n2. Credit \n3. Debit \n4. display details \n5. Exit");
            int choosedOption = scanner.nextInt();
            switch (choosedOption) {
                case 1:
                    System.out.println("You choose Account creation");
                    account = accountCreation(scanner);
                    break;
                case 2:
                    System.out.println("You choose Credit");
                    credit(account, scanner);
                    break;
                case 3:
                    System.out.println("You choose Debit");
                    debit(account, scanner);
                    break;
                case 4:
                	displayDetails(account);
                	break;
                case 5:
                    isExit = true;
                    break;
            }
        }
    }

    private static void displayDetails(IAccount account) {
		if(account==null) {
			System.out.println("First create an a account");
			return;
		}
		if(account instanceof SavingsAccount) {
			SavingsAccount acc=((SavingsAccount) account);
			System.out.println("Account Number : "+acc.getAccountNumber());
			System.out.println("Account Name : "+acc.getAccountName());
			System.out.println("Account Balance : "+acc.getAccountBalance());
			return;
		}
		if(account instanceof CurrentAccount) {
			CurrentAccount acc=((CurrentAccount)account);
			System.out.println("Account Number : "+acc.getAccountNumber());
			System.out.println("Over Draft : "+acc.getOverDraft());
			return;
		}
		
	}

	private static void debit(IAccount account, Scanner scanner) {
        if (account == null) {
            System.out.println("First create an a account");
            return;
        }
        System.out.println("Enter amount to debit:");
        double amount = scanner.nextDouble();
        account.debit(amount);
    }

    private static void credit(IAccount account, Scanner scanner) {
        if (account == null) {
            System.out.println("First create an a account");
            return;
        }
        System.out.println("Enter amount to credit:");
        double amount = scanner.nextDouble();
        account.credit(amount);
    }

    private static IAccount accountCreation(Scanner scanner) {
        System.out.println("Choose options :\n1. Savings Account \n2. Current Account");
        int accountType = scanner.nextInt();
        scanner.nextLine();
        switch (accountType) {
            case 1:
                return createSavingsAccount(scanner);
            case 2:
                return createCurrentAccount(scanner);
        }
		return null;
    }

    private static IAccount createSavingsAccount(Scanner scanner) {
        IAccount account = AccountManager.getAccount("Savings");
        if (account instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) account;
            System.out.println("Enter Account Number:");
            long accountNumber = scanner.nextLong();
            savingsAccount.setAccountNumber(accountNumber);
            System.out.println("Enter Account Name:");
            String accountName = scanner.next();
            savingsAccount.setAccountName(accountName);
            System.out.println("Enter Initial Balance:");
            double initialBalance = scanner.nextDouble();
            savingsAccount.setAccountBalance(initialBalance);

            System.out.println("Savings Account created successfully.");
        }
        return account;
    }

    private static IAccount createCurrentAccount(Scanner scanner) {
        IAccount account = AccountManager.getAccount("Current");
        if (account instanceof CurrentAccount) {
            CurrentAccount currentAccount = (CurrentAccount) account;
            System.out.println("Enter Account Number:");
            long accountNumber = scanner.nextLong();
            currentAccount.setAccountNumber(accountNumber);
            System.out.println("Enter Overdraft Limit:");
            double overdraftLimit = scanner.nextDouble();
            currentAccount.setOverDraft(overdraftLimit);

            System.out.println("Current Account created successfully.");
        }
        return account;
    }
}
