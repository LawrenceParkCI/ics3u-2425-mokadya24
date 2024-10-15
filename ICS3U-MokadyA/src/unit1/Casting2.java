package unit1;

/**
* Description: work sheet 
* Date: 10/10/2024
* @author 
*/
public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);
    //implicit casting ^
    
    //explicit casting
    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?

    //the code is chosing the variable "myChar" to be "a". it is printing it, then adding one to the ascii value, then printing that. after, it makes a new variable "char2". then you add one to the value but you cast it into a char changing it to "b"
    
    //Why do you think this happens?
    //this happens because the ascii value of a is 97, then you add one to that with implicit casting
    
    //Investigate what is ASCII. What is it?
    //it is the number value of each letter and character
    
    //Can you find the number value for 'a'? Does it match with your findings above?
    //the value of a is 97, this matches my findings
    
    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
    char myCharCap = (char)(myChar - 32);
    System.out.println(myCharCap);
    

  }
}