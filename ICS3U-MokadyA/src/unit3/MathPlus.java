package unit3;

import java.util.Scanner;

/**
Description: Using methods to do different math operations
Date: December 17, 2024
@author Amir Mokady
 */
public class MathPlus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	}

	/**
	 * This method uses the x and y coordinates of the start position
	 * and the end position to find the distance between the 2 points 
	 * 
	 * @param x1 The x value of the start position
	 * @param y1 The y value of the start position
	 * @param x2 The x value of the end position
	 * @param y2 The y value of the end position
	 * @return returns the distance between the start and end positions
	 */
	public static double distance(int x1, int y1, int x2, int y2) {
		
		int dx = x2 - x1; //the total difference between the 2 points on the x axis
		int dy = y2 - y1; //the total difference between the 2 points on the y axis

		double delta = Math.sqrt(dx * dx + dy * dy); //use Pythagorean theorem

		return delta;
	}
	
	/**
	 * This method finds the hypotenuse of a triangle using the
	 * Pythagorean theorem
	 * 
	 * @param a One side of the triangle
	 * @param b The second side of the triangle
	 * @return returns the length of the last side of the triangle
	 */
	public static double hypotenuse(double a, double b) {

		double c = Math.sqrt(a * a + b * b); //use Pythagorean theorem

		return c;
	}
	
	/**
	 * This method is used to find the amount of factors of a certain number.
	 * It does this by multiplying the number by every single number before it
	 * 
	 * @param num
	 * @return
	 */
	public static int numOfFactors(int num) {
		
		int divide = 0;
		int factors = 0;
		
		for (int i = 0; i < num; i++) {
			
			divide += 1;
			if (num % divide == 0) {
				factors += 1;
			}
		}
		
		return factors;
	}
	
	public static boolean isPrime(int num) {
		
		boolean prime;
		
		if (numOfFactors(num) == 2) {
			prime = true;
		}
		else {
			prime = false;
		}
		
		return prime;
	}
}
