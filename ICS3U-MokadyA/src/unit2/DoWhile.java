package unit2;

/**
Description:
Date:
@author 
 */

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
		 */
		Scanner in = new Scanner(System.in);
		String name;
		int repeat = 0;
		
		System.out.print("What is your favorite word?");
		name = in.nextLine();
		
		do {
			System.out.println(name);
			repeat += 1;
		} while (repeat <= 19);

		System.out.println("You are welcome into the secret secret pogchamp club.");

		in.close();

		//Run the code. Explain the code in your own words
		//the code asks for a name, and if that name is not mr.lee, it will repeat itself. if it is, it will print out "You are welcome into the secret secret pogchamp club."
		
		//What code is repeated?
		//When does it decide whether to repeat or not?
		//What is the condition for repeating?
		//the code being repeated is all the code in between the braces of the do function
		//it is decided whether to repeat after the code is run once, and the while () condition is checked
		//the condition for repeating is if the name is NOT equal to Mr. Lee


		/*
    Note:Pay attention to the brackets, and the semicolon
		 */

		/*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.
	}
}