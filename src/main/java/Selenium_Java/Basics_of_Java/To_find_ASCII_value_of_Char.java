package Selenium_Java.Basics_of_Java;
//ASCII stands for American Standard Code for Information Interchange.
public class To_find_ASCII_value_of_Char {

	public static void main(String[] args) {
		char ch = 'a';
        int ascii = ch;
       
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

	}

}
