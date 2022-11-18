package Selenium_Java.Basics_of_Java;

public class Find_largest_among_numbers {

	public static void main(String[] args) {
		double n1 = -4.5, n2 = 4.2, n3 = 2.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
        
       
        double n4 = -4.5, n5 = 3.9, n6 = 5.5;

        if(n4 >= n5) {
            if(n4 >= n6)
                System.out.println(n4 + " is the largest number.");
            else
                System.out.println(n6 + " is the largest number.");
        } else {
            if(n5 >= n6)
                System.out.println(n5 + " is the largest number.");
            else
                System.out.println(n6 + " is the largest number.");
        }
	}
}
	


