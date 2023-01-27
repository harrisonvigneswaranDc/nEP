// By: Harrison Vigneswaran

// Name of the program: fundamentals
// Date: 2023-01-23
// Description: This program will display my name, favorite quote and ask user for a number
//              Print out a meaningful message with that number.


package classexercise1;

import java.util.Scanner;

public class fundamentals {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		// This declares the variable age as an integer.
		
	
		System.out.println("Welcome to the fundamentals program!!! My name is Harrison. Lets get started!!!");

		System.out.println("My favorite quote is from the movie 'The Dark Knight' which is "
				+ "'You Either Die A Hero Or Live Long Enough To See Yourself Become The Villain'.");
         //This where i got my favorite quote from:https://www.pinkvilla.com/lifestyle/people/30-powerful-dialogues-dark-knight-movies-are-worth-remembering-786178
		
		System.out.println("Please enter your age");
		age = input.nextInt();
		// This will ask the user for age.
		System.out.println("Yes your age is " + (age));		
		// This will print out users age.
		//hello

	}
	

}
