package unit1;

import java.util.Scanner;

public class MakeLables {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
			String subject;
			String name;
			
			System.out.println("Type in the name and press <enter>");
			name = sc.nextLine();
			System.out.println("Type in the subject and press <enter>");
			subject = sc.nextLine();
				System.out.println();
				System.out.println("**************************");
				System.out.println(name);
				System.out.println(subject);
				System.out.println("**************************");
				sc.close();
	}

}
