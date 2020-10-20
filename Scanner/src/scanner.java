import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		System.out.println("what is your name?");
		boolean isPizzaDeliciues = true;
		
		//type identifier = new type()
		Scanner scanner = new Scanner(System.in); //system.in is a constructor (it is the consol here)
		String name = scanner.nextLine();
		String easier = "waw, this is easy";
		System.out.println("hello " + name);
		
		String string = new String("Hello there! ");
		System.out.println(string + " :) ");
		System.out.println(easier);
		
		//int x = 5; //premitive
		//x = 10; // x can be reassined or changed
		//to make a variable constant use the "final" statment 
		
		// final int = 10 
		// global variable like
		// public static final double PI = 3.4159 to use this variable throughout the program
		//scanner.PI
		//to asain it 
		Integer y = 5; //object (auto boxing. 5 is autoboxed )
		System.out.println(x);
		System.out.println(y);
		
		

	}

}
