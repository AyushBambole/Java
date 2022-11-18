//Print an Integer Entered by the User.
package Selenium_Java.Basics_of_Java;

import java.util.Scanner;

public class Java_Program_to_Print_an_Integer {

	private static Scanner reader;

	public static void main(String[] args) {

        // The code creates a reader instance which intakes
        // input from user and shows what is entered by user.
		
        reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

      
        int number = reader.nextInt();

        // println() prints the output
        System.out.println("You entered: " + number);
    }


	}


