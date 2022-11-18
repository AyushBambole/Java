package Selenium_Java.Basics_of_Java;

public class Check_Whether_Alphabet_is_Vowel_or_Consonant {

	public static void main(String[] args) {
		
		//Using if-else statement
		char ch = 'o';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
        
       //Using switch statement
        char ch1 = 'z';

        switch (ch1) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch1 + " is vowel");
                break;
            default:
                System.out.println(ch1 + " is consonant");
                   
        }
	}
}
	
        

	


