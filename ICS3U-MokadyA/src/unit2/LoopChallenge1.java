package unit2;

import java.util.Scanner;

/**
Description: loop challenge 1 work sheet
Date: nov, 22 2024
@author Amir Mokady
 */

public class LoopChallenge1 {
	public static void main(String[] args) {
		/*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */

		//initializing the variables
		int numTry = 3;
		String userGuess;
		String password = "password";
		
		//making a do while statement, so that the program runs at least once
		do {
			//user inputing their guess for what the password is
			Scanner sc = new Scanner(System.in);
			System.out.println("What is the password?");
			userGuess = sc.nextLine();
			
			//if else statement to check if the password is correct
			if (userGuess.equals(password)) {
				System.out.println("Thats correct, welcome Mr. President");
				numTry = 0;
			}
			else {
				numTry -= 1;
				System.out.println("Nuh uh, that wasn't right.\nNumber of tries remaining: " + numTry + "\n");
				
				if (numTry == 0) {
					System.out.println("You got it wrong, to bad so sad.\nTry again in... NEVER!");
				}
			
			}						
		}
		while (numTry >= 1);
	}
}