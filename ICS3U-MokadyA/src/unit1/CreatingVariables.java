package unit1;
/**
 *Description:
 *Date: September, 30, 2024
 *@author 
 */
public class CreatingVariables {
	/**
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		System.out.println("Warm-up");
		//Warmup: print your name
		System.out.println("\nAmir Mokady");
		//Warmup: print the calculation for the area of a square with side length 25
		System.out.println(25*25);

		//Key Question: what if the value I want to use needs to change?
		//You could make a variable and then change the value of that, or you could go back in the code and change it
		/*
Variables
- A variable is a place in memory that you can tell your computer to set aside when you make a program.
- This location can be used to store a piece of information.
- You can give this location a name
- You can change the information that the location holds.
- You can recall the value of this memory location later and use in different parts of your program

		 */

		System.out.println("\nPart 1");
		//what do you notice is being printed out?
		//It is printing out the number 10
		int myNum;
		myNum = 10;
		System.out.print("myNum = ");
		System.out.println(myNum);

		myNum = 20;
		System.out.println("myNum is now " + myNum);
		//Why do the two codes print out different things?
		// because after you said "myNum = 10" you changed the variable to equal to 20

		System.out.println("\nPart 2 - Creating a Variable");

		/*
A variable be:
		 *declared* (Necessary) - you're telling the computer that you need to keep a value, and the computer will create a space in memory for it

ie.
int myNum; //you are declaring a variable called myNum that stores an int type of data

		 *initialized*(Necessary) - in order to use the variable, you first need to give it an initial value. Otherwise, the computer won't be able to do something with the variable

myNum = 10; //initializes the value of myNum to 10, so I can use it in other ways

		 *assigned* - similar to initialize, that you're setting the value of the variable to another value

myNum = 20; //I've changed the value of myNum

Once your variable has been given a value, it can then be *referenced* - that is, it can be used by its name
		 */

		//Declare and initialize an int variable called myAge that stores your age.
		int myAge = 16;

		//Print it out in a sentence (Hint: remember how we combined text and numbers in a print statement)
		System.out.println("My age is " + myAge);
		
		//Assign it a new value, that is 10 more than the original value
		myAge = myAge + 10; 
		
		//Print it out in a new sentence (Hint: remember how we combined text and numbers in a print statement)
		System.out.println("My age is " + myAge);

		//Note: When I use the word create in the future, I typically mean declare and initialize
	}
}