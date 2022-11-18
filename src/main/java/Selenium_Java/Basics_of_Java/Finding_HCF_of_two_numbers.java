package Selenium_Java.Basics_of_Java;

public class Finding_HCF_of_two_numbers {

	public static void main(String[] args) {
		
		// find HCF between n1 and n2
	    int n1 = 81, n2 = 153;
	    
	    // initially set to gcd
	    int gcd = 1;

	    for (int i = 1; i <= n1 && i <= n2; ++i) {

	      // check if i perfectly divides both n1 and n2
	      if (n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	  }

	}


