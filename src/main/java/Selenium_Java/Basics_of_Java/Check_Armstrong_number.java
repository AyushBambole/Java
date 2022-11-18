package Selenium_Java.Basics_of_Java;

//In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal
//to the number itself. For example:

//Example- 153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
public class Check_Armstrong_number {

	public static void main(String[] args) {
		
		int number = 1634, originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

}


