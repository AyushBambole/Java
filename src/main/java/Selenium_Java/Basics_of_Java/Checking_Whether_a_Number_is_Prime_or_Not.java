package Selenium_Java.Basics_of_Java;

public class Checking_Whether_a_Number_is_Prime_or_Not {

	public static void main(String[] args) {
		
		int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }

	}


