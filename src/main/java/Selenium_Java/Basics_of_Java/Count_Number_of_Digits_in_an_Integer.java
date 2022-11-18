package Selenium_Java.Basics_of_Java;

public class Count_Number_of_Digits_in_an_Integer {

	public static void main(String[] args) {
		int count = 0, num = 00034567;

	    while (num != 0) {
	      // num = num/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }

	}


