
package loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
	/*ICU
	 * 
	 * Initialize
	 * Condition/Comparison
	 * Update
	 */
	/*	System.out.println("guess the password");
		String password = ("let me in");
		Scanner scanner = new Scanner(System.in);
		String guess = scanner.nextLine();
		
				

		while(!guess.equals(password))
		{
			System.out.println("wrong password, guess again");
			guess = scanner.nextLine();
		}
		System.out.println("you got it, Congrats");
		scanner.close();
	}

*/}

// do while loop
	{ 
	   String password = ("let me in");
       Scanner scanner = new Scanner(System.in);
       String guess;
       do 
       {
    	   System.out.println("guess the password");
    	   guess = scanner.nextLine();
       }
       while(!guess.equals(password));
       System.out.println("you got it, Congrats");
		scanner.close();
}
}

