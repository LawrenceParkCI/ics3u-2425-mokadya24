package unit2;

/**
* Description: Basic Boolean work sheet
* Date: nov, 4, 2024
* @author Amir Mokady
*/

public class BasicBoolean {
	
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either _true__ or _false__
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out true because firstnum is smaller than second num
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out false because firstnum isn't bigger than second num
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out true because after turning 5.5 to an int, both variables have a value of 5
    System.out.println("3: " + (firstNum <= (int)thirdNum));
    
    //this prints out true because firstnum is smaller that tirdnum, even if only by 0.5
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: bigger than
      * < means: smaller than
      * <= means: smaller or equal to
      * >= means: bigger or equal to
      * == means: equal to
      * != means: doens't equal to
    */

  }
}