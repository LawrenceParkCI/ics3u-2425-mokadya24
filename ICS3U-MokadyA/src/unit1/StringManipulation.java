package unit1;
/**
 * Description: Manipulating strings assignment
 * Date: October, 4, 2024
 * @author Amir Mokady
 */

import java.util.Scanner;

public class StringManipulation {
	/**
	 * this is the entry point
	 * @param args unused
	 */
	public static void main(String[] args) {
		//declaring variable
		String newSentence;
		
		//finding the sentence to use
		Scanner sc = new Scanner(System.in);
			System.out.println("What is the sentence you would like me to manipulate?");
			newSentence = sc.nextLine();
		sc.close();
		
		//declaring new variables based on the initialization of the sentence
		String uprCase = newSentence.toUpperCase();
		String lwrCase = newSentence.toLowerCase();
		char letter = newSentence.charAt(5);
		int firstWord = newSentence.indexOf(" ");
		int lastWord = newSentence.lastIndexOf(" ");
		
		//manipulating the sentence
		System.out.println("\nThis is how I will change your sentence:\n");
		System.out.println(newSentence + " is your sentence");
		System.out.println(uprCase);
		System.out.println(lwrCase);
		System.out.println("Your sentence has " + newSentence.length() + " letters (including spaces)");
		System.out.println("At index 5, the character is: " + letter);
		System.out.println("The first word of your sentence is: " + newSentence.substring(0,firstWord));
		System.out.println("The lst word of your sentence is: " + newSentence.substring(lastWord));
	}

}
