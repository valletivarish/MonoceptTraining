package com.monocept.enums;

import java.util.Random;
import java.util.Scanner;

public class ChooseColor {

    enum Colors {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Colors[] colorsArray = Colors.values();
        Colors selectedColor = colorsArray[random.nextInt(colorsArray.length)];

        System.out.println("Welcome to the Color Guessing Game!");
        System.out.println("Try to guess the color chosen by the computer.");

        while (true) {
            System.out.println("Available colors:  Red, Green, Blue");
            System.out.print("Enter your guess: ");
            String userGuess = scanner.next().toUpperCase();

            if (isValidColor(userGuess)) {
                Colors guessedColor = Colors.valueOf(userGuess);
                if (guessedColor == selectedColor) {
                    System.out.println("Congratulations! You guessed the color correctly.");
                    break;
                } else {
                    System.out.println("Wrong guess. Try again!");
                }
            } else {
                System.out.println("Invalid color. Please choose from the available colors.");
            }
        }

        scanner.close();
    }

    private static boolean isValidColor(String color) {
        for (Colors c : Colors.values()) {
            if (c.toString().equals(color)) {
                return true;
            }
        }
        return false;
    }
}


