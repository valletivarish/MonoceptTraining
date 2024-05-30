package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Account;
import com.monocept.model.AccountType;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Account accounts[]=new Account[4];
		
		for(int i=0; i<accounts.length;i++) {
			accounts[i]=new Account();
			System.out.println("Enter Account Number : ");
			accounts[i].setAccountNumber(scanner.nextInt());
			System.out.println("Enter Account holder name : ");
			accounts[i].setAccountName(scanner.next());
			System.out.println("Enter Account Balance : ");
			accounts[i].setAccountBalance(scanner.nextDouble());
			System.out.println("Enter Account Type : for svaings press 1 or for current press 2 : ");
			int accountType=scanner.nextInt();
			if(accountType==1) {
				accounts[i].setAccountType(AccountType.Savings);	
			}
			else if(accountType==2) {
				accounts[i].setAccountType(AccountType.Current);;
			}
			
		}
		for(int i=0; i<accounts.length;i++) {
		System.out.println(accounts[i]);
		}

	}

}
