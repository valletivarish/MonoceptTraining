package com.monocept.assignment;
import java.util.Scanner;
public class PigGame {
	private static final int WINNING_SCORE = 20;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int score = 0;
        int turns = 0;
        System.out.println("Game Rules: \n\n1)See how many turns it takes you to get to 20.\n2)Turn ends when you hold or roll a 1.\n3)If you roll a 1, you lose all points for the turn.\n4)If you hold, you save all points for the turn.");
        System.out.println("Start game");
        System.out.println("\nPlease enter 'h' for hold or 'r' for roll");
        checkTotalScore(totalScore, score, turns, scanner);
    }
    private static void checkTotalScore(int totalScore, int score, int turns, Scanner scanner) {
        while (totalScore < WINNING_SCORE) {
            String option = scanner.nextLine();
            int[] result = processOption(option, score, turns, totalScore);
            score = result[0];
            turns = result[1];
            totalScore = result[2];
        }
        System.out.println("\nCongratulations!\nYou finished in " + turns + " turns");
    }
    private static int[] processOption(String option, int score, int turns, int totalScore) {
        if (option.equalsIgnoreCase("r")) {
            return rollDie(score, turns, totalScore);
        }
        return holdTurn(score, turns, totalScore);
    }
    private static int[] holdTurn(int score, int turns, int totalScore) {
        totalScore += score;
        turns++;
        System.out.println("Score for turn " + turns + " : " + score + "\nTotal score : " + totalScore);
        score = 0;
        return new int[]{score, turns, totalScore};
    }
    private static int[] rollDie(int score, int turns, int totalScore) {
        int rolledDice = (int) (Math.random() * 6) + 1;
        System.out.println("Die : " + rolledDice);
        if (rolledDice == 1) {
            score = 0;
            turns++;
            System.out.println("Turn over. No score.");
            return new int[]{score, turns, totalScore};
        }
        score += rolledDice;
        return new int[]{score, turns, totalScore};
    }
}
