package unit2;

import java.util.Scanner;

/**
* Description: if statement 2 work sheet
* Date: nov, 5 2024
* @author Amir Mokady
*/

public class IfStatement2 {
  public static void main(String[] args) {
    
	
	  
	Scanner in = new Scanner(System.in);

    System.out.println("What is your age?");
    int userAge = in.nextInt();
    
    /*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      title = "Adult";
    } 
    else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
      
    }

    System.out.println(title);
    */
    //Looking at the logic above, why do you think the 
    //program won't work?
    //because the variable wasn't initialized outside of a block of code, if the else statement was run instead of the if statement then that variable wouldn't have been initialized but still would have tried to be used

    //Copy the code below, and try to find a solution.
    //Comment the code above to avoid compilation errors.
    
    String title;
    
    if (userAge > 18) { //If they're over 18, they are titled an adult
      title = "Adult";
    } 
    else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
      title = "youth"; 
    }

    System.out.println(title);
    
  }
}