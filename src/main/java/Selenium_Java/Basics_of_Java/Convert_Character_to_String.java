package Selenium_Java.Basics_of_Java;

public class Convert_Character_to_String {

	public static void main(String[] args) {
		
		char ch = 'c';
        String st = Character.toString(ch);
        
        System.out.println("The string is: " + st);
        
     // Alternatively
        char ch1 = 'h';
        st = String.valueOf(ch1);
        System.out.println("The string is: " + st);
	}

}
