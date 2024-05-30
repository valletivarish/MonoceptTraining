package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account= new Account(0,"savings","user",0.0);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Account Number : "+account.getAccountNumber());
		System.out.println("Account type  : "+account.getAccountType());
		System.out.println("Account Name : "+account.getAccountName());
		System.out.println("Account balance  : "+account.getAccountBalance());
		System.out.println("Enter the details : ");
		System.out.println("enter the account number : ");
		long accountnumber=scanner.nextLong();
		account.setAccountNumber(accountnumber);
		System.out.println("enter the account type : ");
		String accounttype=scanner.next();
		account.setAccountType(accounttype);
		System.out.println("enter the account name : ");
		String name=scanner.next();
		account.setAccountName(name);
		System.out.println("enter the account balance : ");
		double salary=scanner.nextDouble();
		account.setAccountBalance(salary);
		
		System.out.println("Account Number : "+account.getAccountNumber());
		System.out.println("Account type  : "+account.getAccountType());
		System.out.println("Account Name : "+account.getAccountName());
		System.out.println("Account balance  : "+account.getAccountBalance());

	}

}
