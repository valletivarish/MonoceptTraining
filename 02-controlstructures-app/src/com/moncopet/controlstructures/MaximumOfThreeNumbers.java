package com.moncopet.controlstructures;

import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();
        System.out.println(printMaximumNumber(number1, number2, number3) + " is the maximum number");
    }

    private static int printMaximumNumber(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }
        if (number2 > number1 && number2 > number3) {
            return number2;
        }
        return number3;
    }
}
