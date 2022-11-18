package Selenium_Java.Basics_of_Java;

public class Multiplication_of_Table {

	public static void main(String[] args) {
		//For Loop
		int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }

        //While Loop
        int num1 = 9, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d * %d = %d \n", num1, i, num1 * i);
            i++;
        }
	}

}
