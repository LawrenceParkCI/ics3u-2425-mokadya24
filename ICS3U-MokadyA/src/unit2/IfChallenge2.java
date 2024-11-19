package unit2;

import java.util.Scanner;

/**
 * Description: if challenge work sheet 2
 * Date: nov, 11 2024
 * @author Amir Mokady
*/

public class IfChallenge2 {
  public static void main(String[] args) {
    //This is for the portfolio

    /*Create a program that asks for three numbers.
    Tell the user if the numbers are strictly in order.
    ie.  2 5 11 or 5 6 7 are strictly in order.
    ie.  6 5 7 or 5 5 7 are not
    */
	  
	  int num1;
	  int num2;
	  int num3;
	  
	  Scanner sc = new Scanner(System.in);
	  	System.out.println("What is the first number?");
	  	num1 = sc.nextInt();
	  	System.out.println("What is the second number?");
	  	num2 = sc.nextInt();
	  	System.out.println("What is the third number?");
	  	num3 = sc.nextInt();
	  sc.close();
	  
	  if (num1 < num2 && num2 < num3) {
		  System.out.println("These numbers are strictly in order");
	  }
	  else if(num1 > num2 && num2 > num3) {
		  System.out.println("These numbers are in reverse order");
	  }
	  else {
		  System.out.println("These are not in order");
	  }
	  	
	  
  }
}