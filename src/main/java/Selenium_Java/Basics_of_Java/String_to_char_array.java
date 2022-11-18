package Selenium_Java.Basics_of_Java;

import java.util.Arrays;

public class String_to_char_array {

	public static void main(String[] args) {
		
		String st = "The project has been completed before dues";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));

	}

}
