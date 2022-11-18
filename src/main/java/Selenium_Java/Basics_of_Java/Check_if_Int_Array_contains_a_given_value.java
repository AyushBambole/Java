package Selenium_Java.Basics_of_Java;

import java.util.Scanner;

public class Check_if_Int_Array_contains_a_given_value {

	private static Scanner reader;

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 4, 5};
		System.out.println("Enter number:");
		reader = new Scanner(System.in);
		int toFind = reader.nextInt();
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");

	}

}
