package com.monocept.ocp.solution.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.monocept.ocp.solution.model.DiwaliFestival;
import com.monocept.ocp.solution.model.FixedDeposit;
import com.monocept.ocp.solution.model.HoliFestival;
import com.monocept.ocp.solution.model.NewYearFestival;
import com.monocept.ocp.solution.model.OtherDays;
import com.monocept.ocp.solution.model.SICalculator;

public class FixedDepositTest {

    public static void main(String[] args) {
    	
        FixedDeposit fixedDeposit1 = new FixedDeposit(1, "Rock", 10000, 2);
        System.out.println("Account Number : " + fixedDeposit1.getAccountNumber());
        System.out.println("Account Holder Name : " + fixedDeposit1.getName());
        System.out.println("Principal : " + fixedDeposit1.getPrincipal());
        System.out.println("Duration : " + fixedDeposit1.getDuration());
        SICalculator siCalculator = new SICalculator(fixedDeposit1);

        System.out.println("Total Simple Interest : " + siCalculator.calculateSimpleInterest(new DiwaliFestival()));
        System.out.println("Total amount : " + (fixedDeposit1.getPrincipal() + siCalculator.calculateSimpleInterest(new DiwaliFestival())));
        System.out.println();

        FixedDeposit fixedDeposit2 = new FixedDeposit(2, "John", 10000, 3.5);
        System.out.println("Account Number : " + fixedDeposit2.getAccountNumber());
        System.out.println("Account Holder Name : " + fixedDeposit2.getName());
        System.out.println("Principal : " + fixedDeposit2.getPrincipal());
        System.out.println("Duration : " + fixedDeposit2.getDuration());
        siCalculator = new SICalculator(fixedDeposit2);
        System.out.println("Total Simple Interest : " + siCalculator.calculateSimpleInterest(new HoliFestival()));
        System.out.println("Total amount : " + (fixedDeposit2.getPrincipal() + siCalculator.calculateSimpleInterest(new HoliFestival())));
        System.out.println();

        FixedDeposit fixedDeposit3 = new FixedDeposit(3, "Jack", 10000, 4.5);
        System.out.println("Account Number : " + fixedDeposit3.getAccountNumber());
        System.out.println("Account Holder Name : " + fixedDeposit3.getName());
        System.out.println("Principal : " + fixedDeposit3.getPrincipal());
        System.out.println("Duration : " + fixedDeposit3.getDuration());
        siCalculator = new SICalculator(fixedDeposit3);
        System.out.println("Total Simple Interest : " + siCalculator.calculateSimpleInterest(new NewYearFestival()));
        System.out.println("Total amount : " + (fixedDeposit3.getPrincipal() + siCalculator.calculateSimpleInterest(new NewYearFestival())));
        System.out.println();

        FixedDeposit fixedDeposit4 = new FixedDeposit(4, "Bob", 10000, 3);
        System.out.println("Account Number : " + fixedDeposit4.getAccountNumber());
        System.out.println("Account Holder Name : " + fixedDeposit4.getName());
        System.out.println("Principal : " + fixedDeposit4.getPrincipal());
        System.out.println("Duration : " + fixedDeposit4.getDuration());
        siCalculator = new SICalculator(fixedDeposit4);
        System.out.println("Total Simple Interest : " + siCalculator.calculateSimpleInterest(new OtherDays()));
        System.out.println("Total amount : " + (fixedDeposit4.getPrincipal() + siCalculator.calculateSimpleInterest(new OtherDays())));
    }

}
