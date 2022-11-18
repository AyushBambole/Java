package Selenium_Java.Basics_of_Java;

import java.util.Scanner;

public class To_Compute_Quotient_and_Remainder {

	private static Scanner reader;

	public static void main(String[] args) {
	
		System.out.println("Enter two numbers :");
		reader = new Scanner(System.in);
		
		int dividend = reader.nextInt();
		int divisor = reader.nextInt();
		
	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);

	}

}
