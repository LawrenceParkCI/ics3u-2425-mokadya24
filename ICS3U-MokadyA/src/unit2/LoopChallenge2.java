package unit2;

import java.util.Scanner;

/**
 Description: loop challenge 2 work sheet
 Date: nov, 22 2024
 @author Amir Mokady
*/

public class LoopChallenge2 {
  public static void main(String[] args) {
    /*
      Write a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.
      
      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.
      
      Use the loop that you didn't use in LoopChallenge1
    */
	  
	  //initializing variables
	  int loopCheck = 1;
	  int num1 = 0;
	  double sqrt;
	  boolean positive = false;
	  
	  //this is the loop
	  while (loopCheck == 1) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Please input a positive number,\nso that I can find its square root for you.");
		  num1 = sc.nextInt();
		  
		  //if else method to determine if the number is positive
		  if (num1 >= 1) {
			  positive = true;
			  loopCheck = 0;
		  }
		  else {
			  System.out.println("Hey! Thats not a positive number you silly goose.");
		  }
	  }
	  
	  if (positive == true) {
		  sqrt = Math.sqrt(num1);
		  System.out.println("The square root of " + num1 + " is " + sqrt);
	  }
	  
  }
}