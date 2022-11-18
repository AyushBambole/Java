package Selenium_Java.Basics_of_Java;

public class Finding_Prime_Numbers_Between_Two_Intervals {

	public static void main(String[] args) {
		
		int low = 1, high = 50;

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
    }

}


