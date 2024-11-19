package unit1;
/**
 * Description: How long you have lived for and slept
 * Date: October, 4, 2024
 * @author Amir Mokady
 */

import java.util.Scanner;

public class Alive {
	/**
	 * this is the entry point
	 * @param args unused
	 */
	public static void main(String[] args) {
	
		//variables to save and calculate the years months and days
		int birthYear;
		int birthMonth;
		int birthDay;
		int currentYear;
		int currentMonth;
		int currentDay;		
		
		//scanning for their birthdate and current year
		Scanner sc = new Scanner(System.in);
			System.out.println("What is your birthdate?");
			System.out.println("Year:");
			birthYear = sc.nextInt();
			System.out.println("Month: [numbers only please :)]");
			birthMonth = sc.nextInt();
			System.out.println("Day:");
			birthDay = sc.nextInt();
			
			System.out.println("\nNow, for the current date.");
			System.out.println("Year:");
			currentYear = sc.nextInt();
			System.out.println("Month: [Again, only numbers please :)]");
			currentMonth = sc.nextInt();
			System.out.println("Day:");
			currentDay = sc.nextInt();
		sc.close();
		
		//doing the math and variables for the final output
		int daysAlive = (currentYear*365 + currentMonth*30 + currentDay) - (birthYear*365 + birthMonth*30 + birthDay);
		int hoursAsleep = daysAlive*8;
		
		System.out.println("\nYou have been alive for " + daysAlive + " days");
		System.out.println("You have also slept for " + hoursAsleep + " hours");
	
	}

}
