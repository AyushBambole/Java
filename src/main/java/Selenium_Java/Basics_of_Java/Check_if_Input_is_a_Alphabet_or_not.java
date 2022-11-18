package Selenium_Java.Basics_of_Java;

public class Check_if_Input_is_a_Alphabet_or_not {

	public static void main(String[] args) {
		
		char c = '*';
		
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");

	}

}
