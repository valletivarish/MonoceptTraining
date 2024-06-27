package com.monocept.ocp.violation.test;

import com.monocept.ocp.violation.model.FestivalType;
import com.monocept.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit1=new FixedDeposit(1,"Rock",10000,2,FestivalType.HOLI);
		System.out.println("Account Number : "+fixedDeposit1.getAccountNumber());
		System.out.println("Account Holder Name : "+fixedDeposit1.getName());
		System.out.println("Pinciple : "+fixedDeposit1.getPrinciple());
		System.out.println("Duration : "+fixedDeposit1.getDuration());
		System.out.println("Rate for "+FestivalType.HOLI+" festival :"+fixedDeposit1.getInterestRate());
		System.out.println("Total Simple Interest : "+fixedDeposit1.calculateSimpleInterest());
		System.out.println("Total amount : "+(fixedDeposit1.getPrinciple()+fixedDeposit1.calculateSimpleInterest()));
		System.out.println();
		FixedDeposit fixedDeposit2=new FixedDeposit(2,"John",10000,3.5,FestivalType.DIWALI);
		System.out.println("Account Number : "+fixedDeposit2.getAccountNumber());
		System.out.println("Account Holder Name : "+fixedDeposit2.getName());
		System.out.println("Pinciple : "+fixedDeposit2.getPrinciple());
		System.out.println("Duration : "+fixedDeposit2.getDuration());
		System.out.println("Rate for "+FestivalType.DIWALI+" festival :"+fixedDeposit2.getInterestRate());
		System.out.println("Total Simple Interest : "+fixedDeposit2.calculateSimpleInterest());
		System.out.println("Total amount : "+(fixedDeposit2.getPrinciple()+fixedDeposit2.calculateSimpleInterest()));
	    System.out.println();
		FixedDeposit fixedDeposit3=new FixedDeposit(3,"Jack",10000,4.5,FestivalType.NEWYEAR);
		System.out.println("Account Number : "+fixedDeposit3.getAccountNumber());
		System.out.println("Account Holder Name : "+fixedDeposit3.getName());
		System.out.println("Pinciple : "+fixedDeposit3.getPrinciple());
		System.out.println("Duration : "+fixedDeposit3.getDuration());
		System.out.println("Rate for "+FestivalType.NEWYEAR+" festival :"+fixedDeposit3.getInterestRate());
		System.out.println("Total Simple Interest : "+fixedDeposit3.calculateSimpleInterest());
		System.out.println("Total amount : "+(fixedDeposit3.getPrinciple()+fixedDeposit3.calculateSimpleInterest()));
		System.out.println();
		FixedDeposit fixedDeposit4=new FixedDeposit(4,"Bob",10000,3,FestivalType.OTHER);
		System.out.println("Account Number : "+fixedDeposit4.getAccountNumber());
		System.out.println("Account Holder Name : "+fixedDeposit4.getName());
		System.out.println("Pinciple : "+fixedDeposit4.getPrinciple());
		System.out.println("Duration : "+fixedDeposit4.getDuration());
		System.out.println("Rate for "+FestivalType.OTHER+" days :"+fixedDeposit4.getInterestRate());
		System.out.println("Total Simple Interest : "+fixedDeposit4.calculateSimpleInterest());
		System.out.println("Total amount : "+(fixedDeposit4.getPrinciple()+fixedDeposit4.calculateSimpleInterest()));
	}

}
