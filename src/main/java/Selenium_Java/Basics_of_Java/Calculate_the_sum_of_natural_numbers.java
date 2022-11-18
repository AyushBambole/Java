package Selenium_Java.Basics_of_Java;

import java.util.Scanner;

public class Calculate_the_sum_of_natural_numbers {

	private static Scanner reader;

	public static void main(String[] args) {
		
		//Using For Loop
        System.out.println("Enter the Number");
		
		reader = new Scanner(System.in);
		
		int num = reader.nextInt(), sum = 0;
	

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
        
        //Using While Loop
        System.out.println("Enter the Number");
		
		reader = new Scanner(System.in);
		
		
        int num1 = reader.nextInt(), sum1 = 0;

        int i = 0;
		while(i <= num1)
        {
            sum1 += i;
            i++;
        }

        System.out.println("Sum = " + sum1);
        
        

	}

}
