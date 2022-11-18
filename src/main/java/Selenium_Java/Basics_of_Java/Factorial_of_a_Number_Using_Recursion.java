package Selenium_Java.Basics_of_Java;

public class Factorial_of_a_Number_Using_Recursion {

	public static void main(String[] args) {
		
		int num = 8;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

}


