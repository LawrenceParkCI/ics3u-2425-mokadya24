package unit3;

/**
Description:
Date:
@author 
 */

public class MethodsChallenge1 {
	public static void main( String[] args )    {
		// Complete the function below. Don't forget to comment.
		double d1 = distance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );

		double d2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );

		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );

		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}

	/**
 (Description)
 @param x1 -> The first x position (aka the start)
 @param y1 -> The first y position (aka the start)
 @param x2 -> The second x position (aka the end)
 @param y2 -> The second y position (aka the end)
 @return the distance between both points
	 */
	public static double distance( int x1, int y1, int x2, int y2 )
	{
		int dx = x2 - x1; //the total difference between the 2 points on the x axis
		int dy = y2 - y1; //the total difference between the 2 points on the y axis
		
		double delta = Math.sqrt(dx * dx + dy * dy); //use Pythagorean theorem

		return delta;
	}
}