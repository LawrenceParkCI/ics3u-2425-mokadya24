package unit1;

//import for scanner
import java.util.Scanner;

//import for date and time
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.time.LocalDateTime;    

/**
 * Description: Grocery Shopping receipt unit 1 final project
 * Date: October, 24, 2024
 * @author Amir Mokady
 */

public class GroceryShopping {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		//declaring all the variables ahead of time
		String item1;
		double cost1;
		int amount1;
		String item2;
		double cost2;
		int amount2;
		double totalCost1;
		double totalCost2;
		double subTotal;
		double tax;
		double finalCost;
		
		//Formating the date and time output
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
				   
		System.out.println("|| $$$ \\\\\\ ========== \"Amir's Grocery\" ========== /// $$$ ||\r\n");
		
		//scanning and asking for user input for their item, the cost, and amount of the item
		Scanner sc = new Scanner(System.in);
			System.out.println("What are you purchasing today?");
			item1 = sc.nextLine();
			System.out.println("How much does each " + item1 + " cost?");
			cost1 = sc.nextDouble();
			System.out.println("How many " + item1 + "s are you purchasing?");
			amount1 = sc.nextInt();
			System.out.println("Thank you for purchasing this item :)\n");
			
			System.out.println("What is the second thing you are purchasing today?");
			sc.nextLine();
			item2 = sc.nextLine();
			System.out.println("How much does each one " + item2 + " cost?");
			cost2 = sc.nextDouble();
			System.out.println("How many " + item2 + "s are you purchasing?");
			amount2= sc.nextInt();
			System.out.println("Thank you for purchasing this item :)\n");
		sc.close();
		
		//calculating the final costs for all of the items
		totalCost1 = cost1 * amount1;
		totalCost2 = cost2 * amount2;
		subTotal = totalCost1 + totalCost2;
		tax = subTotal * 0.13;
		finalCost = subTotal + tax;
		
		//formating the currency values
		DecimalFormat money = new DecimalFormat("##0.00");
		double fC = Math.rint(finalCost*20)/20;
		//fC stands for "five cents"
		
		System.out.println("This is your receipt:\n");
		
		//the actual receipt, formated
		System.out.format("%-30s", "Amir's Grocery\n");
		System.out.println(dtf.format(now));
		System.out.format("%-10s %-10s %-10s %10s", "Item", "|\tPrice", "|\tQuant.", "|	Total Price");
		System.out.println("\n___________________________________________________________");
		System.out.format("%-10s %7s %7s %4s %13s", item1, "|$\t" + money.format(cost1), "|\t" + amount1, "\t |$  ", money.format(totalCost1));
		System.out.format("\n%-10s %7s %7s %4s %13s", item2, "|$ \t" + money.format(cost2), "|\t" + amount2, "\t |$  ", money.format(totalCost2));
		System.out.println("\n___________________________________________________________");
		System.out.format("%50s %8s", "Subtotal:", "$" + money.format(subTotal));
		System.out.format("\n%50s %8s", "Tax:", "$" + money.format(tax));
		System.out.format("\n%50s %8s", "Total:", "$" + money.format(finalCost));
		
		//final lines plus problem
		
		System.out.println("\n\nRounding to the nearest dollar: $" + Math.round(finalCost));
		System.out.println("\nRounding to the nearest 5 cents: $" + money.format(fC));
		System.out.println("\nHave a great day!\n" + "Thank you for shoping at Amir's Grocery!");
	}

}
