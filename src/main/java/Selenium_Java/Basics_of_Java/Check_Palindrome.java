package Selenium_Java.Basics_of_Java;

public class Check_Palindrome {

	public static void main(String[] args) {
	//	A string is called a palindrome string if the reverse of that string is the same
	//	as the original string. For example, radar, level, etc.
		
		String str = "Radar", reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	  }

	}


