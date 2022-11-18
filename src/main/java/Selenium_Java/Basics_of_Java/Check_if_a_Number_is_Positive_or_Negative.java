package Selenium_Java.Basics_of_Java;

import java.util.Scanner;

public class Check_if_a_Number_is_Positive_or_Negative {

	private static Scanner reader;

	public static void main(String[] args) {
		
    System.out.println("Enter the Number");
		
		reader = new Scanner(System.in);
		
		
		double number =  reader.nextInt();

        // true if number is less than 0
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        // true if number is greater than 0
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

        // if both test expression is evaluated to false
        else
            System.out.println(number + " is 0.");

	}

}
