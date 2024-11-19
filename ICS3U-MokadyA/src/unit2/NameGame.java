package unit2;

import java.util.Scanner;

/**
 * Description: name game work sheet
 * Date: nov 19, 2024
 * @author Amir Mokady
 */
public class NameGame {

	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */

		//Declaring the variables
		String name;
		int chance;
		
		//user inputs their name
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		name = sc.nextLine();
		sc.close();
		
		//making the random chance. chooses random number, starts at one and goes 10 digits in. 
		chance = (int)(Math.random()*10) + 1;
		
		if (chance > 3) {
			System.out.println("Wow, " + name + " is my favorite name!");
		}
		else {
			System.out.println("Welp, " + name + " sucks, better luck in your next life I guess...");
		}
	}

}
