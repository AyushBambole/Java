package Selenium_Java.Basics_of_Java;

public class Find_Frequency_of_Character {

	public static void main(String[] args) {

		String str = "Life is so much simpler.";
        char ch = 'i';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);

	}

}
