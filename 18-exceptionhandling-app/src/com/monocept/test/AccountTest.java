package com.monocept.test;
import java.util.Scanner;

import com.monocept.exceptions.InsufficientFundsException;
import com.monocept.exceptions.NegativeAmountException;
import com.monocept.model.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("Varish", 10, 10000);
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("choose option : \n1. Deposit \n2. Withdraw \n3. Display \n4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("you choosed deposit ");
                    System.out.println("Enter the amount :");
                    double depositAmount = scanner.nextDouble();
                    try {
                        account.deposit(depositAmount);
                    } catch (NegativeAmountException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("you choosed withdraw ");
                    System.out.println("Enter the amount :");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (NegativeAmountException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Details of account : ");
                    System.out.println("Account Holder Name : " + account.getAccountName());
                    System.out.println("Account Number : " + account.getAccountNumber());
                    System.out.println("Account Balance : " + account.getAccountBalance());
                    break;
                case 4:
                    System.out.println("Thank you for visiting");
                    exit = true;
                    break;
            }
        }
    }
}
