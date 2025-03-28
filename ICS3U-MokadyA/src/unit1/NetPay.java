package unit1;
/**
 * Description: calculating the net pay of worker
 * Date: October, 4, 2024
 * @author Amir Mokady
 */
public class NetPay {
	/**
	 * this is the entry point
	 * @param args unused
	 */
	public static void main(String[] args) {
	
		//makeing the variables
		double netPay;
		int hours = 40;
		double wage = 5.00;
		double insurance = 2.00;
		double tax = 0.22;
		netPay = (hours*wage-insurance) - tax*(hours*wage-insurance);
		
		//dispaying it
		System.out.println("The net pay is " + netPay);
	}

}
