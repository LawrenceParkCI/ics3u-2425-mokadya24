package unit2;

//scanner input
import java.util.Scanner;

/**
 * description: finding if the user inputed number is negative or positive, then if it is divisible by 7
 * date: Nov, 1, 2024
 * @author Amir Mokady
 */
public class PositiveNegative {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		//variables
		int num;

		//scanning for input
		Scanner sc = new Scanner(System.in);
			System.out.println("Please input an integer");
			num = sc.nextInt();
		sc.close();

		//if the value is greater than zero, it has to be positive
		if (num > 0) {
			System.out.println("This is a positive number");
		}
		else {
			System.out.println("This is an negative number");
		}
		
		//if the value after mod 7 is zero, it is divisible by 7
		if (num %7 == 0) {
			System.out.println("This number is divisible by 7");
		}
		else {
			System.out.println("This number is not divisible by 7");
		}
	}

}
