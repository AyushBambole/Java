package Selenium_Java.Basics_of_Java;

public class Sum_of_Natural_numbers_using_recursion {

	public static void main(String[] args) {
		int number = 20;
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }

}


