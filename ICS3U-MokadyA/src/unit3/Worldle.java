package unit3;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import hsa_new.Console;

public class Worldle {

	static Console c;
	static int secondsElapsed = 0;

	public static void main(String[] args) throws InterruptedException {

		BufferedImage map = null;

		try {
			// Load the map image from the specified file path
			map = ImageIO.read(new File("src/unit3/images/ascii-art.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		c = new Console(50, 300);

		int falseCheck = 0;
		int trueCheck = 0;
		int userReady;
		String userGuess = "";
		boolean firstGuess = true;
		int restart = 1;


		// Display welcome message and prompt the user to start the game
		c.println("Hello! Welcome to the country guesser game!\nAre you ready to start?\n1)yes 2)no");
		userReady = c.readInt();
		while (c.readLine().matches("[a-zA-Z]")) {
			c.println("Please input only numbers");
			userReady = c.readInt();
		}
		
		// Exit if the user chooses not to play
		if (userReady != 1) {
			System.exit(0);
		}

		c.println("Great, let's begin! The game will begin when you enter your first guess. \nYou just need to name all the countries you see on the map.");
		//Thread.sleep(4000);

		Timer timer = new Timer();

		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				displayTimer();
			}
		}, 0, 1000);

		// Main game loop
		do {
			do {
				c.clear();

				// Display the map image on the console
				c.drawImage(map, 650, 0, 1000, 1000, null);

				if (firstGuess == true) {
					// Display the number of correct and incorrect guesses
					c.print("\nCorrect Guesses: 0/50");
					c.println("\tIncorrect guesses: 0");
				}

				if (firstGuess != true) {
					if (countriesIncorrect(userGuess) == false) {
						falseCheck += 1;
					}
				}
				if (firstGuess != true) {
					if (countriesCorrect(userGuess) == true) {
						trueCheck += 1;
					}
				}


				if (firstGuess != true) {
					// Display the number of correct and incorrect guesses
					c.print("\nCorrect Guesses: " + trueCheck + "/50");
					c.println("\tIncorrect guesses: " + falseCheck);
				}

				// Prompt the user for their guess
				c.print("\nGuess:");
				userGuess = c.readLine();

				firstGuess = false;

			} while (trueCheck < 50);
			c.clear();

			c.println("\nCongratulations! You've named all the countries.\nDo you want to play again?\n1) yes 2) no");
			restart = c.readInt();
			while (c.readLine().matches("[a-zA-Z]")) {
				c.println("Please input only numbers");
				restart = c.readInt();
			} 
			
			trueCheck = -1;
			falseCheck = 0;
			
		} while (restart == 1);

		timer.cancel();
	}


	/**
	 * Displays the elapsed time in minutes and seconds format.
	 * This method is called periodically by the TimerTask.
	 * @throws InterruptedException 
	 */
	public static void displayTimer() {
		int minutes = secondsElapsed / 60;
		int seconds = secondsElapsed % 60;
		DecimalFormat timeFormat = new DecimalFormat("00");
		c.setColor(Color.WHITE);
		c.fillRect(0, 90, 70, 30);
		c.setColor(Color.BLACK);
		c.drawString("Time: " + timeFormat.format(minutes) + ":" + timeFormat.format(seconds), 0, 105);
		secondsElapsed++;
	}

	/**
	 * Checks the user's guess against a list of countries and counts how many are correct.
	 * @param userGuess The user's input string representing their guess.
	 * @return The number of correct guesses.
	 */
	public static boolean countriesCorrect(String userGuess) {
		String[] countries = {"Albania", "Latvia", "Andorra", "Liechtenstein", "Armenia", "Lithuania", "Austria", "Luxembourg", "Azerbaijan", "Malta", "Belarus", "Moldova", "Belgium", "Monaco", "Bosnia and Herzegovina", "Montenegro", "Bulgaria", "Netherlands", "Croatia", "Norway", "Cyprus", "Poland", "Czech Republic", "Portugal", "Denmark", "Romania", "Estonia", "Russia", "Finland", "San Marino", "Former Yugoslav Republic of Macedonia", "Serbia", "France", "Slovakia", "Georgia", "Slovenia", "Germany", "Spain", "Greece", "Sweden", "Hungary", "Iceland", "Switzerland", "Ireland", "Turkey", "Italy", "Ukraine", "Kosovo", "United Kingdom"};

		for (int i = 0; i < countries.length; i++) {
			if (userGuess.equalsIgnoreCase(countries[i])) {
				if (!countries[i].equalsIgnoreCase("")) {
					countries[i] = ""; // Mark the country as guessed
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * Counts the number of incorrect guesses made by the user.
	 * @param userGuess The user's input string representing their guess.
	 * @return The number of incorrect guesses.
	 */
	public static boolean countriesIncorrect(String userGuess) {
		boolean notReal = false;
		String[] countries = {"Albania", "Latvia", "Andorra", "Liechtenstein", "Armenia", "Lithuania", "Austria", "Luxembourg", "Azerbaijan", "Malta", "Belarus", "Moldova", "Belgium", "Monaco", "Bosnia and Herzegovina", "Montenegro", "Bulgaria", "Netherlands", "Croatia", "Norway", "Cyprus", "Poland", "Czech Republic", "Portugal", "Denmark", "Romania", "Estonia", "Russia", "Finland", "San Marino", "Former Yugoslav Republic of Macedonia", "Serbia", "France", "Slovakia", "Georgia", "Slovenia", "Germany", "Spain", "Greece", "Sweden", "Hungary", "Sweden", "Iceland", "Switzerland", "Ireland", "Turkey", "Italy", "Ukraine", "Kosovo", "United Kingdom"};

		for (int i = 0; i < countries.length; i++) {
			if (userGuess.equalsIgnoreCase(countries[i])) {
				notReal = true;
				return true;
			}
		}

		if (notReal = true) {
			return false;
		}
		else {
			return true;
		}
	}
}
