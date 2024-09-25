package unit1;
/**
 * Description: About me and my school timetable<br>
 * Date: September, 24, 2024
 * @author Amir Mokady
 */
public class AboutMe {

	public static void main(String[] args) {
		//self info
		System.out.println("Amir \n LPCI \n Grade 11 \n Ms. Kemp");
		System.out.println("\n\"Go Panthers!\"");
		
		//TimeTable
		System.out.println("\n\nDay: \t   |Classes:");
		System.out.print("____________________________________________________");
		System.out.format("\n%-10s %10s \n%10s", "Monday", "|Comp Sci.  English  Functions  Marketing", "\t   | 9:00       10:20     12:40     2:00");
		System.out.print("\n____________________________________________________");
		System.out.format("\n\n%-10s %10s \n%10s", "Tuesday", "|English  Comp Sci.  Marketing  Functions", "\t   | 9:00      10:20      12:40     2:00");
		System.out.print("\n____________________________________________________");
		System.out.format("\n\n%-10s %10s \n%10s", "Wendesday", "|Comp Sci.  English  Functions  Marketing", "\t   | 9:55       11:00     1:00      2:05");
		System.out.print("\n____________________________________________________");
		System.out.format("\n\n%-10s %10s \n%10s", "Thursday", "|English  Comp Sci.  Marketing  Functions", "\t   | 9:00      10:20      12:40     2:00");
		System.out.print("\n____________________________________________________");
		System.out.format("\n\n%-10s %10s \n%10s", "Friday", "|Comp Sci.  English  Functions  Marketing", "\t   | 9:00       10:20     12:40     2:00");
	}

}
