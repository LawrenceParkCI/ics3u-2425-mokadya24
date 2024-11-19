package unit1;
/**
 * Date: October, 4, 2024
 * Description: This is a math work sheet
 * @author Amir Mokady
 */
public class PlayingWithStrings {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {

		String name1 = "Pierre Elliott Trudeau";
		String name2 = name1.substring(0, 6) + name1.substring(15);
		System.out.println(name2);
	}

}
