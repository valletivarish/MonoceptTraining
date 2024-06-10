package com.monocept.assignment;

import java.util.Scanner;
import java.lang.Math;

public class NumberGuessRefactored {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no_of_chances = 10;
        int computer_guess = (int) (Math.random() * 100) + 1;
        System.out.println("Hello User! Welcome to the game of guessing number. Please guess the number between 1 to 100.");

        while (no_of_chances > 0) {
            System.out.println("You will be having " + no_of_chances + " attempts\n");
            int user_guess = getUserInput(scanner);
            if (!isGuessValid(user_guess)) {
                no_of_chances--;
                continue;
            }
            if (user_guess == computer_guess) {
                int total_chances = 11 - no_of_chances;
                System.out.println("Congratulations! You guessed it in " + total_chances + " attempt(s).");
                return;
            }
            displayHint(user_guess, computer_guess);
            no_of_chances--;
        }
        System.out.println("You lose! You have completed your chances. The correct number was: " + computer_guess);
    }

    private static int getUserInput(Scanner scanner) {
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    private static boolean isGuessValid(int guess) {
        if (guess < 1 || guess > 100) {
            System.out.println("Please enter a number between 1 to 100.");
            return false;
        }
        return true;
    }

    private static void displayHint(int user_guess, int computer_guess) {
        if (user_guess > computer_guess) {
            System.out.println("\nSorry, your guess is too high.");
            return;
        }
        System.out.println("\nSorry, your guess is too low.");
    }
}
