package unit1;

import java.util.Scanner;

/**
 * Description: Casting 1 work sheet
 * Date: 10/10/2024
 * @author 
 */
public class Casting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		System.out.println(doubleNum);
		// a double, because an integer = a double changes the integer to a double

		//can you explain what is happening in this code?
		doubleNum = doubleNum + 2.2;
		//doubleNum (10.0) is being added with 2.2, then being assaigned to the variable doubleNum. another way of saying this is that the value of doubleNum is being added to 2.2 then re-saved as the sum

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		System.out.println(intNum);
		// an integer, because even though doubleNum is a double we are casting it to be an integer

		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double implicit
      double to int explicit
      int to long implicit
      long to int explicit

    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
		 */
		// if the original value is a smaller than the one that we are trying to convert it into, then it is implicit. if not, then we have to state it ourselves which is explicit

		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?

		Scanner in = new Scanner(System.in);
		double myNum;
		System.out.println("Give me decimal number up to the hundredth");
		//code
		myNum = in.nextDouble();
		System.out.print("Rounding down to the nearest tenth, it is: ");
		myNum = myNum*10;
		myNum = (int) myNum;
		myNum = (double)myNum/10;
		System.out.println(myNum);
		in.close();
	}
}