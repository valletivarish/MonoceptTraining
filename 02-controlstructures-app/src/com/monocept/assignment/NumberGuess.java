package com.monocept.assignment;

import java.util.Scanner;
import java.lang.Math;
public class NumberGuess {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no_of_chances=10;
		boolean verify=true;
		int computer_guess=(int)(Math.random()*100)+1;
		System.out.println("Hello User Welcome to the game of guessing number \nPlease guess the number between 1 to 100");
		while (no_of_chances>0) {
			System.out.println("You will be having "+no_of_chances+" attempts");
			int user_guess=scanner.nextInt();
			if (user_guess>0 && user_guess<=100) {
				if (user_guess==computer_guess) {
					int total_chances=11-no_of_chances;
					System.out.println("You Won !! you have guessed it in "+total_chances+" attempt");
					verify=false;
					break;
				}
				else if(user_guess>computer_guess) {
					System.out.println("Sorry,Too High");
				}
				else if(user_guess<computer_guess) {
					System.out.println("Sorry,Too Low");
				}
				
			}
			else {
				System.out.println("Please Enter the number between 1 to 100");
			}
			no_of_chances--;
		}
		if(verify){
		System.out.println("You loose, you have completed your chances");
		}

	}

}
