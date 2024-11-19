package unit1;
/**
 * Date: October, 4, 2024
 * Description: This is a math work sheet
 * @author Amir Mokady
 */
import java.util.Scanner;

public class InputChars {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char ch1, ch2, ch3;
		System.out.println("Type in any three characters on the keyboard");		
		System.out.println("Press <Enter> after each.");
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		System.out.println();
		System.out.println("Together these 3 letters spell: " + ch1 + ch2 + ch3);
		
		sc.close();
	}

}
