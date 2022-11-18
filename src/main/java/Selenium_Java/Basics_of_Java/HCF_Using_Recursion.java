package Selenium_Java.Basics_of_Java;

public class HCF_Using_Recursion {

	public static void main(String[] args) {
		
		int n1 = 366, n2 = 60;
        int hcf = hcf(n1, n2);

        System.out.printf("HCF of %d and %d is %d.", n1, n2, hcf);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }

}


