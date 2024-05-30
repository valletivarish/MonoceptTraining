package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account1 = new Account();
		System.out.println("Enter the details of first account : ");
		System.out.println("Enter the account number : ");
		long accountNumber=scanner.nextLong();
		account1.setAccountNumber(accountNumber);
		System.out.println("Enter the account type : ");
		String accountType=scanner.next();
		account1.setAccountType(accountType);
		System.out.println("Enter the account name : ");
		String accountName=scanner.next();
		account1.setAccountName(accountName);
		System.out.println("Enter the account balance  : ");
		double accountBalance=scanner.nextDouble();
		account1.setAccountBalance(accountBalance);
		
		System.out.println("details of first account : ");
		System.out.println("account number : "+account1.getAccountNumber());
		System.out.println("account type : "+account1.getAccountType());
		System.out.println("account name : "+account1.getAccountName());
		System.out.println("account balance : "+account1.getAccountBalance());
		System.out.println("\n");
		
		Account account2 = new Account();
		System.out.println("Enter the details of second account : ");
		System.out.println("Enter the account number : ");
		accountNumber=scanner.nextLong();
		account2.setAccountNumber(accountNumber);
		System.out.println("Enter the account type : ");
		accountType=scanner.next();
		account2.setAccountType(accountType);
		System.out.println("Enter the account name : ");
		accountName=scanner.next();
		account2.setAccountName(accountName);
		System.out.println("Enter the account balance  : ");
		accountBalance=scanner.nextDouble();
		account2.setAccountBalance(accountBalance);
		
		System.out.println("details of second account : ");
		System.out.println("account number : "+account2.getAccountNumber());
		System.out.println("account type : "+account2.getAccountType());
		System.out.println("account name : "+account2.getAccountName());
		System.out.println("account balance : "+account2.getAccountBalance());
		
		

	}

}
