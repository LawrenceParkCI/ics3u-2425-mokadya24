package unit1;
/**
 * Description: the rules of bingo, as well as an example bingo card<br>
 * Date: September, 26, 2024
 * @author Amir Mokady
 */
public class Bingo {

	public static void main(String[] args) {
		//Rules
		System.out.println("Bingo Rules:");
		System.out.println("\n1- Caller picks a number at random between 1-75");
		System.out.println("\n2- Player tries to locate the number on their card.\n   If they find the card, they mark it off");
		
		//Bingo card
		System.out.println("\n\nBingo Card Example:\n");
		System.out.println("\t_______________________________________________");
		System.out.format("\t%-10s %-10s %-10s %-10s %-10s", "|B", "I", "N", "G", "O |");
		System.out.format("\n\t%-10s %-10s %-10s %-10s %-10s", "|3", "8", "13", "1", "11|");
		System.out.format("\n\t%-10s %-10s %-10s %-10s %-10s", "|16", "29", "21", "20", "18|");
		System.out.format("\n\t%-10s %-9s %-11s %-10s %-10s", "|34", "45", "FREE", "42", "37|");
		System.out.format("\n\t%-10s %-10s %-10s %-10s %-10s", "|50", "47", "53", "57", "49|");
		System.out.format("\n\t%-10s %-10s %-10s %-10s %-10s", "|62", "75", "74", "70", "66|");
		System.out.println("\n\t_______________________________________________");

	}
	
}
