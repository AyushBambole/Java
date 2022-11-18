package Selenium_Java.Basics_of_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_Java_Array_to_List {

	public static void main(String[] args) {
		
		// create an array
	    String[] array = {"Java", "Python", "C"};
	    System.out.println("Array: " + Arrays.toString(array));

	    // convert array to list
	    List<String> languages= new ArrayList<String>(Arrays.asList(array));

	    System.out.println("List: " + languages);

	}

}
