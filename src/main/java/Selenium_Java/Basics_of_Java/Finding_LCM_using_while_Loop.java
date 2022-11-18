package Selenium_Java.Basics_of_Java;

public class Finding_LCM_using_while_Loop {

	public static void main(String[] args) {
		
		int n1 = 72, n2 = 120, lcm;

	    // maximum number between n1 and n2 is stored in lcm
	    lcm = (n1 > n2) ? n1 : n2;

	    // Always true
	    while(true) {
	      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
	        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
	        break;
	      }
	      ++lcm;
	    }
	  }

	}


