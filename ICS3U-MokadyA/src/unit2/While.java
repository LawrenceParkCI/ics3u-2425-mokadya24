package unit2;

/**
Description: while loop work sheet
Date: nov, 21 2024
@author Amir Mokady
 */

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What word do you want me to say?");
		
		int numPeople = 20;
		
		//Why do you think I coded it this way?
		String name = in.nextLine();
		
		while (numPeople > 0) {
			
			//Why do you think the variable is declared here?
			System.out.println(name);

			numPeople = numPeople - 1;
		}


		in.close();
		//Run the code Using the debugger. 
		//Explain the code in your own words
		//the code asks for the amount of people coming, then uses this number to determine how many times to run the loop
		
		//What code is repeated?
		//When does it decide whether to repeat or not?
		//What is the condition for repeating?
		/*
		the code being repeated is 
		System.out.print("What is this person's name? ");

		//Why do you think the variable is declared here?
		String name = in.nextLine();
		System.out.println("Welcome, " + name + "!");

		numPeople = numPeople - 1;
		*/
		//it decides whether to repeat or not at the beginning of the loop every time, until the condition isn't met
		//the condition for repeating is whether the number of people left is more than zero
		
		//What is the difference between a while loop and a do-while loop?
		//while loops check if the condition is met before running the code, but do while loops check if the condition is met after running the code

		//Create a while loop that asks for a word, 
		//and prints it out 20 times.
	}
}