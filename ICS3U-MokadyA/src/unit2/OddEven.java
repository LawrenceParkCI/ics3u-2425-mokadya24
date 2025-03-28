package unit2;

//scanner input
import java.util.Scanner;

/**
 * description: finding if the user inputed number is odd or even
 * date: Nov, 1, 2024
 * @author Amir Mokady
 */
public class OddEven {

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
		
		//if the value is zero after mod 2, it has to be even
		if (num %2 == 0) {
			System.out.println("This is an even number");
		}
		else {
			System.out.println("This is an odd number");
		}
	}

}
