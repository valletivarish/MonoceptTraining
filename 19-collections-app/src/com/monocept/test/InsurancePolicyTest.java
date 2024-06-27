package com.monocept.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

import com.monocept.model.InsurancePolicy;
import com.monocept.model.InsurancePolicyComparator;

public class InsurancePolicyTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<InsurancePolicy> insurancePolicies=new ArrayList<InsurancePolicy>();
		System.out.print("How many Policies : ");
		int noOfPolicies=scanner.nextInt();
		System.out.println("Enter details of "+noOfPolicies+" policies : ");
		for(int i=0;i<noOfPolicies;i++) {
			System.out.println("\nEnter the details of Policy "+(i+1));
			System.out.print("Enter the number : ");
			int policyNumber=scanner.nextInt();
			System.out.print("Enter the holder name : ");
			String policyHolderName=scanner.next();
			System.out.print("Enter the amount : ");
			int policyAmount=scanner.nextInt();
			System.out.println("Enter the creation date : ");
			System.out.print("Enter date : ");
			int date=scanner.nextInt();
			System.out.print("Enter month : ");
			int month=scanner.nextInt();
			System.out.print("Enter year : ");
			int year=scanner.nextInt();
			insurancePolicies.add(new InsurancePolicy(policyNumber,policyHolderName,policyAmount,new Date(year,month,date)));
		}
		boolean exit=false;
		while(!exit) {
			System.out.println("Enter your choice : \n1. Sort by Name \n2. Sort by Amount \n3. Sort by Creation date \n4. Exit");
			int choice=scanner.nextInt();
			switch(choice){
				case 1:
					System.out.println("You choose sort by name");
					sortByNAme(insurancePolicies);
					break;
				case 2:
					System.out.println("You choose sort by amount");
					sortByAmount(insurancePolicies);
					break;
				case 3:
					System.out.println("You choose sort by creation date");
					sortByDate(insurancePolicies);
					break;
				case 4:
					System.out.println("Thank you for visting");
					exit=true;
					
			}
			
		}
	}

	private static void sortByDate(ArrayList<InsurancePolicy> insurancePolicies) {
		Collections.sort(insurancePolicies,new InsurancePolicyComparator.sortBydate());
		System.out.println(insurancePolicies);
		
	}

	private static void sortByAmount(ArrayList<InsurancePolicy> insurancePolicies) {
		Collections.sort(insurancePolicies,new InsurancePolicyComparator.sortByAmount());
		System.out.println(insurancePolicies);
		
	}

	private static void sortByNAme(ArrayList<InsurancePolicy> insurancePolicies) {
		Collections.sort(insurancePolicies,new InsurancePolicyComparator.sortByName());
		System.out.println(insurancePolicies);
		
	}

}
