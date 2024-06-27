package com.monocept.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.monocept.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<Account> accounts=new ArrayList<Account>();
		System.out.println("Enter the no of accounts : ");
		int count=scanner.nextInt();
		for(int i =0;i<count;i++) {
			System.out.println("Enter the account number : ");
			int accNo=scanner.nextInt();
			System.out.println("Enter the account name : ");
			String name=scanner.next();
			System.out.println("Enter the account balance : ");
			double balance=scanner.nextDouble();
			accounts.add(new Account(accNo,name,balance));
		}
		accounts.stream()
		.sorted(Comparator.comparing(Account::getBalance))
		.forEach(x->System.out.println(x.toString()));
		
		accounts.stream()
        .sorted(Comparator.comparing(Account::getBalance).reversed())
        .forEach(account -> System.out.println(account.toString()));


		
		accounts.stream().filter((x)->x.getName().length()>6);
		

	}

}
