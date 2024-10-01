package unit1;
/**
 * Date: October 1
 * Description: This is a math work sheet
 * @author Amir Mokady
 */
public class MathOperators {
	/**
	 *This is the entry point to the program
	 * @param args unused
	 */
	public static void main (String [] args) {
		/*
         Pre: Kind of Math, but not really
         What do you notice is happening?
		 */

		//      System.out.println("Butter" + "fly");
		System.out.println("Butter" + "fly");
		//      System.out.println("1 + 2 + 3 + 4 + 5");
		System.out.println("1 + 2 + 3 + 4 + 5");
		//      System.out.println(1 + 2 + 3 + 4 + 5);
		System.out.println(1 + 2 + 3 + 4 + 5);
		//      System.out.println(1 + 2 + "3 + 4 + 5");
		System.out.println(1 + 2 + "3 + 4 + 5");
		//      System.out.println("1 + 2 + 3" + 4 + 5);
		System.out.println("1 + 2 + 3" + 4 + 5);

		//Why do you think the last two outputs act so differently?
		// they look differently because of the order that they appear in

		//Summary: What are two possible roles of the + operator?
		// to add to numbers, or to "add" a word or sentence to the sysout operation

		/*
         Part 1 
         Figure out what is the meaning of each operator. Use print statements
         to verify your answer and explain.
		 */
		System.out.println("\nPart 1\n");
		
		// + means: add. it is used to add 2 values together
		System.out.println(2+8);
		// - means:subtract. it is used to subtract 2 values from eachother
		System.out.println(10-5);
		// * means: multiply. it is used to multiply the first value by the second
		System.out.println(3*5);
		// / means: divide. it is used to divide the first value by the second
		System.out.println(20/5);



		//Print the following expression: (3 + 2) * 5
		System.out.println((3+2)*5);
		//Print the following expression: 3 + 2 * 5
		System.out.println(3+2*5);
		//Was this expected? Why or why not?
		// it was expected because of BEDMAS
		/*
         Part 2 - Calculate Using Operators
         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit

         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		 */     
		System.out.println("\n45 degrees in Celsius is " + (45*9/5+32) + " in Fahrenheit");
		
		System.out.println("\n900 degrees in Fahrenheit is " + ((900-32)*5/9) + " in Celcius\n");
		
		/*
         Part 3
         Figure out what is the meaning of % as a math operator. Use print statements
         to check your answer.
		 */

		//I think % means: Moduler. it is the difference that you get if you use long division
		System.out.println(15%4);
	}
}