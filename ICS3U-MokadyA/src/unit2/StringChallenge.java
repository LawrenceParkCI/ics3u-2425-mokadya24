package unit2;

import java.util.Scanner;

/**
 * Description: String Challenge work sheet
 * Date: nov, 12 2024
 * @author Amir Mokady
 */

public class StringChallenge {

	public static void main(String[] args) {
		//This is for the portfolio

		/*
    	Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.

    	Also, include an example of explicit and implicit casting.

    	Comment to explain:
      	-when you use the different String functions
      	-when you are casting and how the value is changed
		 */

		//declaring variables
		String word1;
		String word2;
		boolean wordsSame;
		int wordDifference;
		int tOrF;
		
		//finding out the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a word");
		word1 = sc.nextLine();
		System.out.println("Please put in another word");
		word2 = sc.nextLine();
		sc.close();

		//finding out whether the words equal each other using string functions
		if (word1.equals(word2)) {
			wordsSame = true;
			System.out.println("The words are exactly the same");
		}

		else if (word1.equalsIgnoreCase(word2)) {
			wordsSame = true;
			System.out.println("The words are the same, ignoring the capitalization");
		}

		else {
			wordsSame = false;
			System.out.println("The words are NOT the same");
		}
		
		//showcasing the compareTo method
		wordDifference = word1.compareTo(word2);
		
		//explicitly casting boolean into integer
		tOrF = wordsSame ? 1 : 0;
		
		//implicit casting '.' char into a string
		System.out.println(tOrF + wordDifference + " This is the value of the difference between the letters of your two words, plus the boolean value if they are equal each other" + '.');
		
	}
}