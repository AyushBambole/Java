package Selenium_Java.Basics_of_Java;

public class Calculate_power_of_a_number_using_a_while_loop {

	public static void main(String[] args) {
		
		int base = 3, exponent = 4;

	    long result = 1;

	    while (exponent != 0) {
	      result *= base;
	      --exponent;
	    }

	    System.out.println("Answer = " + result);
	  }

	}


