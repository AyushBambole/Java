package Selenium_Java.Basics_of_Java;
//A leap year is exactly divisible by 4 except for century years (years ending with 00).
//The century year is a leap year only if it is perfectly divisible by 400.
import java.util.Scanner;

public class Check_If_a_Year_is_Leap_Year_or_not {

	private static Scanner reader;

	public static void main(String[] args) {
		// year to be checked
        System.out.println("Enter the year");
		
		reader = new Scanner(System.in);
		int  year = reader.nextInt();
	    boolean leap = false;

	    // if the year is divided by 4
	    if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");

	}

}
