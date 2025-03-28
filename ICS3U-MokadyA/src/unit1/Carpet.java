package unit1;
/**
 * Description: Finding the cost to fill a room with carpet
 * Date: October, 4, 2024
 * @author Amir Mokady
 */

import java.util.Scanner;

public class Carpet {
	/**
	 * this is the entry point
	 * @param args unused
	 */
	public static void main(String[] args) {

		//declaring variables
		int length;
		int width;
		int cost;
		
		//scanning the size and cost for the carpet
		Scanner sc = new Scanner(System.in);
			System.out.println("Type in the length of the carpet meters");
			length = sc.nextInt();
			System.out.println("Type in the width of the carpet in meters");
			width = sc.nextInt();
			System.out.println("Type in the cost of the carpet per square meter");
			cost = sc.nextInt();
		sc.close();
		
		//calculating the cost of the carpet
		int size = length*width;
		int totalCost = cost*size;
		
		//outputting the information
		System.out.println("Your carpet is " + size + "m^2");
		System.out.println("The cost of this carpet is $" + totalCost);
		
	}

}
