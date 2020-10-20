package name;
//this program is a dynamic program that can be excuted with out using a command line

import java.util.Scanner;


public class Name {

	public static void main(String[] args) {
		System.out.println("what is your name?");
		
		//type identifier = new type()
		Scanner scanner = new Scanner(System.in); //system.in is a constructor (it is the consol here)
		String name = scanner.nextLine();
		
		System.out.println("hello " + name);
		

	}

}
