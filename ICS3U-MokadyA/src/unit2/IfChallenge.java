package unit2;

import java.util.Scanner;

/**
* Description: if challenge work sheet
* Date: nov, 11 2024
* @author Amir Mokady
*/

public class IfChallenge {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int num1;
    
    //part 1
    
    System.out.println("What is your favorite number?");
    num1 = in.nextInt();
    
    if (num1 < 0) {
    	System.out.println("You need to look on the bright side");
    }
    
    if (num1 % 2 != 0) {
    	System.out.println("Thats a bit strange");
    }
    
    //part 2
    
    if (num1 % 2 == 0 && num1 % 3 == 0) {
    	System.out.println("You should really consider thinking about 6");
    }
    else {
    	System.out.println("You can keep wholesome");
    }
    
    //part 3
    
    int onesDigit = Math.abs(num1) % 10;
    if (onesDigit == 8) {
    	System.out.println("I am too full");
    }
    else if (onesDigit == 9) {
    	System.out.println("Canada is a nice country");
    }
    else {
    	System.out.println("don't count on it");
    }
    
    /*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
    */
    

  }
}