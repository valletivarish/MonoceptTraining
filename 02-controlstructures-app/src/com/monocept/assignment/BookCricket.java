package com.monocept.assignment;

import java.util.Scanner;

public class BookCricket {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player 1 name: ");
        String player1 = scanner.next();
        System.out.print("Enter player 2 name: ");
        String player2 = scanner.next();
        
        int[] player1Result=checkScore(player1);
        int[] player2Result=checkScore(player2); 
        int player1Score=player1Result[0];
        int player1Turns=player1Result[1];
        int player2Score= player2Result[0];
        int player2Turns = player2Result[1];
        if (player1Score > player2Score) {
            System.out.println(player1 + " is winner");
        } else if (player1Score < player2Score) {
            System.out.println(player2 + " is winner");
        } else {
            if (player1Turns < player2Turns) {
                System.out.println(player1 + " is winner");
            } else if (player1Turns > player2Turns) {
                System.out.println(player2 + " is winner");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
    private static int[] checkScore(String player) {
        System.out.println("\n"+player + " starts playing \n");
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int turns = 0;
        char choice = 'y';

        while (turns < 300 && choice == 'y') {
            turns++;
            System.out.println("Turn -> " + turns+"\n");
            int scoreGenerated = (int) (Math.random() * 300) + 1;
            System.out.println("Page number generated: " + scoreGenerated);
            
            if (scoreGenerated % 7 == 0) {
            	System.out.println("score : "+0);
            	System.out.println("total score : "+totalScore);
                System.out.println(player + " is out!");
                break;
            } else {
                int score = scoreGenerated % 7;
                totalScore += score;
                System.out.println("Score: " + score);
                System.out.println("Total score: " + totalScore);
            }

            System.out.print("Continue playing -> y/n: ");
            choice = scanner.next().charAt(0);
        }
        
        System.out.println("\n"+player + " ends with a score of " + totalScore+"\n");
        return new int[] {totalScore, turns};
    }
}
