package Selenium_Java.Basics_of_Java;

public class char_array_to_String {

	public static void main(String[] args) {
		
		char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);

	}

}
