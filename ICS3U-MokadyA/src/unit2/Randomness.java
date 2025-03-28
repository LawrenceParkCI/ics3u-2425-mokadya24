package unit2;

/**

https://www.geeksforgeeks.org/java-math-random-method-examples/

Description: randomness work sheet
Date: nov, 18 2024
@author: Amir Mokady
*/


public class Randomness {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println((int)(Math.random()*900) + 100);
    }

    //Run the program a few times. What do you think is the 
    //range of the numbers generated?
    //any number between 0 and 1
    
    //Read the demo program. Write the code so that the program 
    //will produce a random number between 100 and 1000.
    
  }
}