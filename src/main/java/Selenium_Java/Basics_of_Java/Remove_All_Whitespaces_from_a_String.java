package Selenium_Java.Basics_of_Java;

public class Remove_All_Whitespaces_from_a_String {

	public static void main(String[] args) {
		
		String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }

	

}
