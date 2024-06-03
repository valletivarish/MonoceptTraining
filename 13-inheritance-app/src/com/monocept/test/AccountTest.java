package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;

public class AccountTest {
    public static void main(String[] args) {
    	SavingsAccount savingsAccount = new SavingsAccount(10,"Varish",10000,5000);
    	CurrentAccount currentAccount = new CurrentAccount(10,"Varish",20000,10000);
        Scanner scanner = new Scanner(System.in);
        boolean exit=false;
        while(!exit) {
        	exit=handleAccountType(scanner,savingsAccount, currentAccount);
        }
    }
	private static boolean handleAccountType(Scanner scanner, Account savingsAccount, Account currentAccount) {
		System.out.println("Select Account Type : \n1. Savings\n2. Current \n3. Exit");
		int accountType=scanner.nextInt();
		switch(accountType) {
		case 1:
			System.out.println("You Choose Savings Account");
			handleOperation(accountType, scanner,savingsAccount);
			return false;
		case 2:
			System.out.println("You Choose Current Account");
			handleOperation(accountType, scanner, currentAccount);
			return false;
		case 3:
			System.out.println("Thank you for visiting");
			return true;
		}
		return false;
		
	}
	private static void handleOperation(int accountType, Scanner scanner, Account account) {
		boolean exitOperation=false;
		while(!exitOperation) {
			System.out.println("\nSelect Operation : \n1. Create Account \n2. Display Account Details \n3. Credit \n4. Debit \n5. Exit");
			int operation=scanner.nextInt();
			switch(operation) {
			case 1:
				System.out.println("You Selected Creating Account");
				createAccount(accountType,scanner, account);
				break;
			case 2:
				System.out.println("You Selected Displaying Account Details");
				displayDetails(account);
		
				break;
			case 3:
				System.out.println("You Selected Crediting into account");
				creditAccount(accountType,account, scanner);
		
				break;
			case 4:
				System.out.println("You Selected Debiting into account");
				debitAccount(accountType,account, scanner);

				break;
			case 5:
				exitOperation=true;
			}
		}
		
	}
	private static void debitAccount(int accountType, Account account, Scanner scanner) {
		System.out.println("Enter Amount to Debit : ");
		int amount=scanner.nextInt();
		if(account instanceof SavingsAccount) {
			SavingsAccount savingsAccount = (SavingsAccount) account;
			savingsAccount.validateMinimumBalance(amount);
		}
		if(account instanceof CurrentAccount) {
			CurrentAccount currentAccount = (CurrentAccount) account;
			currentAccount.validateOverDraft(amount);
		}	
	}
	private static void creditAccount(int accountType, Account account, Scanner scanner) {
		System.out.println("Enter Amount to credit : ");
		long amount=scanner.nextInt();
		account.credit(amount);
		
	}
	private static void displayDetails(Account account) {
		System.out.println("\nDetails of your Account : ");
		System.out.println("Account Number : "+account.getAccountNumber());
		System.out.println("Account Holder Name : "+account.getAccountName());
		System.out.println("Account Balance : "+account.getAccountBalance());
		
	}
	private static void createAccount(int accountType, Scanner scanner, Account account) {
		System.out.println("Please Enter Details : ");
		System.out.print("Enter Account Number : ");
		account.setAccountNumber(scanner.nextLong());
		System.out.print("Enter Account Holder Name : ");
		account.setAccountName(scanner.next());
		System.out.print("Enter Opening Balance : ");
		account.setAccountBalance(scanner.nextDouble());
		System.out.println("Your Account is created.");
	}
}
