package Selenium_Java.Basics_of_Java;

public class Swap_Two_Numbers_without_using_Temprory_Variable {

	public static void main(String[] args) {
		float first = 13.0f, second = 24.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

	}

}
