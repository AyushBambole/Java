package Selenium_Java.Basics_of_Java;

import java.util.Scanner;

public class Check_If_Number_is_Even_or_Odd {

	private static Scanner reader;
	private static Scanner reader2;

	public static void main(String[] args) {
		
		// Check whether a number is even or odd using if-else statement
		reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");

    //    Check whether a number is even or odd using the ternary operator
        reader2 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = reader2.nextInt();

        String evenOdd = (num1 % 2 == 0) ? "even" : "odd";

        System.out.println(num1 + " is " + evenOdd);
	}

}
