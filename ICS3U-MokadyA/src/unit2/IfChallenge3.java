package unit2;

import java.util.Scanner;

import java.text.DecimalFormat;

/**
 * Description: This is a multiple choice quiz
 * Date: nov, 14 2024
 * @author Amir Mokady
 */

public class IfChallenge3 {
	public static void main(String[] args) {
		//This is for the portfolio

		/*
    	Write an interactive quiz. It should ask the user three 
    	multiple-choice or true/false questions about something. 
    	It must keep track of how many they get wrong, and print 
    	out a "score" at the end.
		 */

		//declaring variable
		String start;
		String answer1;
		String answer2;
		String answer3;
		String answer4;
		String answer5;
		String restartQuestion;
		int score = 0;
		int restartYOrN = 1;
		double percentGrade;
		char letterGrade;


		//formating for the decimal grade
		DecimalFormat percent = new DecimalFormat("00.0%");

		//Introducing the user to the program
		System.out.println("This is a quick general knowledge quiz to test your smarts!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Are you ready to start? (yes/no)");
		start = sc.nextLine();

		//ends the program if the user doesn't want to start
		if (start.equalsIgnoreCase("yes")) {
			System.out.println("Nice! We're starting, get ready!\n");
		}
		else {
			System.out.println("Okay :(");
			System.exit(0);
		}

		for (;restartYOrN == 1;) {

			//reseting the variables if a loop occurs
			score = 0;
			
			//asking the questions. I will be formating it like a real test and only tell the user their answer after the test is finished
			System.out.println("Question 1) Sharks don't have bones \n)True \n)False\n");
			answer1 = sc.nextLine();

			System.out.println("Question 2) What is the furthest planet from the sun? \n1)Earth \n2)Neptune \n3)Pluto \n4)Saturn \n");
			answer2 = sc.nextLine();

			System.out.println("Question 3) Toronto has hosted the Olympics \n)True \n)False \n");
			answer3 = sc.nextLine();

			System.out.println("Question 4) What does the \".compareTo\" function do in Java? \n1)Compares Apples to Oranges \n2)Checks if two variables are equal \n3)Same as 2, but ignores capitalization \n4)Finds the ascii value of 2 two letters, and subtracts them \n");
			answer4 = sc.nextLine();

			System.out.println("Question 5) How many calories are in an 800 kilogram great white shark? \n1)1.04 million \n2)1.4 million \n3)Lord knows \n4)Winter arc peak \n5)2.83 million \n");
			answer5 = sc.nextLine();

			System.out.println("Alright! Great work, lets see how you did.");

			//finding out what questions where answered correctly, and calculating the score
			if (answer1.equalsIgnoreCase("true") || answer1.equalsIgnoreCase("t")) {
				score += 1;
			}
			if (answer2.equalsIgnoreCase("Neptune") || answer2.equals("2")) {
				score += 1;
			}
			if (answer3.equalsIgnoreCase("False") || answer3.equalsIgnoreCase("f")) {
				score += 1;
			}
			if (answer4.equalsIgnoreCase("Finds the ascii value of 2 two letters, and subtracts them") || answer4.equals("4")) {
				score += 1;
			}
			if (answer5.equalsIgnoreCase("1.04 million") || answer5.equals("1") || answer5.equals("1.04")) {
				score += 1;
			}

			//calculating letter and percent grade
			if (score == 5) {
				percentGrade = 1;
				letterGrade = 'A';
			}
			else if (score == 4) {
				percentGrade = 0.8;
				letterGrade = 'B';
			}
			else if (score == 3) {
				percentGrade = 0.6;
				letterGrade = 'C';
			}
			else if (score == 2) {
				percentGrade = 0.4;
				letterGrade = 'D';
			}
			else if (score == 1) {
				percentGrade = 0.2;
				letterGrade = 'F';
			}
			else {
				percentGrade = 0;
				letterGrade = 'F';
			}

			//outputting the final grade
			System.out.println("\nCalculating... \nCalculating... \nCalculating... \n");
			System.out.println("Your final grade is " + letterGrade + ". The percentage you got was " + percent.format(percentGrade));

			//restarting the program
			System.out.println("Would you like to try again to get a better score?");
			restartQuestion = sc.nextLine();

			if (restartQuestion.equalsIgnoreCase("yes") || restartQuestion.equalsIgnoreCase("y") || restartQuestion.equalsIgnoreCase("ya")) {
				restartYOrN = 1;
			}
			else {
				System.out.println("Alright, have a great day!");
				System.exit(0);
			}
			
		}
		sc.close();
	}
	
}