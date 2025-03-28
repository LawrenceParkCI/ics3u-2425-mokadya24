package unit1;

/**
* Description: casting 3 work sheet
* Date: oct, 15, 2024
* @author Amir Mokady
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //because we didn't specify that we wanted a mathematical operation
    
    //Demonstrate casting a double value to a String in this way
    //Demonstrate casting a boolean value to a String in this way
    //Demonstrate casting a char value to a String in this way
    System.out.println("1 + 2 + 3" + 4.5 + 5.5);
    System.out.println("1 + 2 + 3" + true + false);
    System.out.println("1 + 2 + 3" + 'a' + 'b');

    System.out.println("\nPart 2");
    //In order to change a String into an integer, we need another set of code

    String strNum = "25";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2"
     * "23c"
     * "2 3"
     * "Lol23"
     * "-5"
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    // only -5 works, and I think this is because Integer.parseInt() only works in converting integers, while everything other than -5 in the examples has a character that isn't an integer

    // What do you think the code to change a String to double would look like?
    //Similarly, test out the code and write down what instructions
    double myNum2 = Double.parseDouble(strNum);

    System.out.println(myNum2);
    //When do you think it might be necessary to change a string value into an integer value/double value?
    //if we are asking for a rating from a customer, or in some calculations
  }
}