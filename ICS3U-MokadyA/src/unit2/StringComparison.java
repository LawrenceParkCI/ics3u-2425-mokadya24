package unit2;

import java.util.Scanner;

/**
 * Description: string comparison work sheet
 * Date: nov, 11 2024
 * @author Amir Mokady
*/

class StringComparison {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    String answer;

    System.out.println("What is the capital of Ontario?");
    answer = in.nextLine();

    if (answer == "Toronto") {
      System.out.println("Correct!");
    } else {
      System.out.println("Sorry, that's incorrect.");
    }
    in.close();
    //Run the code. What happens when you type the correct answer? The incorrect answer?
    //they both show up as incorrect
    
    /*
      Strings are objects, not primitives and as such are a 
      *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
    */
    String A = "Sachin";
    String B = "Website";
    String C = "sachin";
    
    System.out.println(A.compareTo(B));
    System.out.println(A.equals(C));
    System.out.println(A.equalsIgnoreCase(C));

    //What values does compareTo() return? How can we 
    //interpret the value?
    //compareTo measure the compares the difference between the first letter of two strings. if they are the same, it compares the second letter and it continues to do so until the letters aren't equal
    
    //what value does equals() and equalsIgnoreCase() return? 
    //What is the difference between these two functions?
    //equals returns true or false whether the two variables have the same value, and equalsIgnoreCase does the same thing but ignores the Case of the letters
  }
}