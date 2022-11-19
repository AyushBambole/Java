package Selenium_Java.Basics_of_Java;

//We create an object of scanner class
import java.util.Scanner;

public class AdditionOfInteger {

	//Reader takes Inputs
	private static Scanner reader;
	private static int sum;
	
	public static void main(String[] args) {
		
		System.out.println("Enter two numbers");
		
		reader = new Scanner(System.in);
		
		int number1 = reader.nextInt();
		int number2 = reader.nextInt();
	   
		sum = number1 + number2;
	    System.out.println("The sum is: " + sum);
	    

	}

}
