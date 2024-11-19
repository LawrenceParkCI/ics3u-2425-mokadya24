package unit2;

import java.util.Scanner;

/**
 * Description: double dice contest work sheet
 * Date: nov, 18 2024
 * @author Amir Mokady
 */
public class DoubleDiceContest {

	public static void main(String[] args) {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */

		//declaring variables. 2 variables for the human and computer (comp) for each dice. scoreDifference will be used to decide the winner
		int humanD1;
		int humanD2;
		int compD1;
		int compD2;
		int scoreDifference;
		int loop;
		String restart;

		System.out.println("Hello! Welcome to the double dice contest!");

		loop = 1;
		//all the calculations, plus the restart
		while (loop == 1) {

			System.out.println("Lets begin!\n\nFirst, The Human!");

			humanD1 = (int)(Math.random()*6) + 1; //human dice roll
			humanD2 = (int)(Math.random()*6) + 1;

			System.out.println("The human rolled a " + humanD1 + " and a " + humanD2 + ". In total, the human got " + (humanD1+humanD2));

			System.out.println("\nNext, the computer!");

			compD1 = (int)(Math.random()*6) + 1; //computer dice roll
			compD2 = (int)(Math.random()*6) + 1;

			System.out.println("The computer rolled a " + compD1 + " and a " + compD2 + ". In total, the computer got " + (compD1 + compD2));

			//calculating the winner
			scoreDifference = (humanD1 + humanD2) - (compD1 + compD2);

			if (scoreDifference > 0) {
				System.out.println("Congrates! You rolled higher than the computer");
			}
			else if (scoreDifference < 0) {
				System.out.println("Oh no, you rolled lower than the computer. Better luck next time.");
			}
			else {
				System.out.println("Wow, you tied! Thats pretty rare, only a 1/12 chance or 8.333%");
			}

			//checking if user wants to try again
			Scanner sc = new Scanner(System.in);
			System.out.println("Would you like to play again?");
			restart = sc.nextLine();

			if (restart.equalsIgnoreCase("yes") || restart.equalsIgnoreCase("y") || restart.equalsIgnoreCase("ya")) {
				System.out.println("Okay, lets restart");
				loop = 1;
			}
			else {
				System.out.println("Alright, have a great day!");
				loop = 0;
			}
		}
	}
}