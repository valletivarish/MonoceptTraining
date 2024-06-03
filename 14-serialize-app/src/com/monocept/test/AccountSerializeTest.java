package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import com.monocept.model.AccountCurrent;
import com.monocept.model.AccountSavings;

public class AccountSerializeTest {
    public static void main(String[] args) throws IOException {
        AccountSavings savingAccount = new AccountSavings();
        AccountCurrent currentAccount = new AccountCurrent();

        savingAccount.setAccountNumber(69);
        savingAccount.setAccountName("Varish");
        savingAccount.setAccountBalance(10000);

        currentAccount.setAccountNumber(58);
        currentAccount.setAccountName("Raj");
        currentAccount.setAccountBalance(50000);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Press 1 for credit, Press 2 for debit, Press 3 to exit: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the amount to credit: ");
                    int creditAmount = scanner.nextInt();
                    savingAccount.credit(creditAmount);
                    currentAccount.credit(creditAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount to debit: ");
                    int debitAmount = scanner.nextInt();
                    if (!savingAccount.validateMinimumBalance(debitAmount)) {
                        System.out.println("Transaction failed for savings account.");
                    }
                    if (!currentAccount.validateOverDraft(debitAmount)) {
                        System.out.println("Transaction failed for current account.");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1 for credit, 2 for debit, or 3 to exit.");
            }
        }
        
        
        System.out.println("Serialization completed");
        System.out.println("\nDetails of Saving Account : \n");
        System.out.println(savingAccount);
        System.out.println("\nDetails of Current Account : \n");
        System.out.println(currentAccount);
        FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("D:\\Monocept\\14-serialize-app\\Data");
			ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
	        objectOutputStream.writeObject(savingAccount);
	        objectOutputStream.writeObject(currentAccount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        
        scanner.close();
    }
}
