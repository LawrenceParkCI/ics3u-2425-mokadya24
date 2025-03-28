package unit1;

import java.util.Scanner;

public class RectArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			//declare variables
			int length, width, depth;
			
			//get the user input
			System.out.println("AREA + DEPTH PROGRAM");
			System.out.println("Type in the length of the rectangle and <Enter>");
			length = sc.nextInt();
			
			System.out.println("Type in the width of the rectangle and <Enter>");
			width = sc.nextInt();
			
			System.out.println("Type in the depth of the rectangle and <Enter>");
			depth = sc.nextInt();
			
			//calculate the area and depth
			int area = length * width;
			int volume = length * width * depth;
			
			//print the output
			System.out.println("The area of your rectangle is " + area);
			sc.close();
			System.out.println("The volume of your rectangle is " + volume);
			sc.close();
	}

}
