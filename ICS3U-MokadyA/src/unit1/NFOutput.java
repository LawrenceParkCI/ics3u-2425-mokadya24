package unit1;

/**
* Description: NF output work sheet
* Date: oct, 17, 2024
* @author Amir Mokady
*/

import java.text.NumberFormat;
import java.util.Scanner;

public class NFOutput {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));
		
		//How can you change how your value is displayed?
		//it isn't customizable like DF, instead there are a bunch of presets to choose from
		
		//What other formats does NumberFormat offer?
		//getInstance returns a general purpose number format
		//getIntegerInstance returns a number format for an integer value
		//getNumberInstance returns the value using the current default format

		sc.close();
	}

}
