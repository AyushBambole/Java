package Selenium_Java.Basics_of_Java;

public class Prime_Numbers_Between_Intervals_Using_Function {

	public static void main(String[] args) {
		
        int low = 20, high = 80;

        while (low < high) {
            if(checkPrimeNumber(low))
                System.out.print(low + " ");

            ++low;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}


