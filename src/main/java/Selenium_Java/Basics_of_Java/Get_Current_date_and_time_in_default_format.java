package Selenium_Java.Basics_of_Java;

import java.time.LocalDateTime;

public class Get_Current_date_and_time_in_default_format {

	public static void main(String[] args) {
	
		LocalDateTime current = LocalDateTime.now();

        System.out.println("Current Date and Time is: " + current);
    }

 }
