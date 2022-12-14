package Selenium_Java.Basics_of_Java;

public class Finding_roots_of_quadratic_equations {

	public static void main(String[] args) {

	//	The standard form of a quadratic equation is:
    //		(ax2 + bx + c = 0)
	//		Here, a, b, and c are real numbers and a can't be equal to 0.

	//		We  calculate the root of a quadratic by using the formula:

	//		x = (-b ± √(b2-4ac)) / (2a)
	//		The ± sign indicates that there will be two roots:

	//		root1 = (-b + √(b2-4ac)) / (2a)
	//		root1 = (-b - √(b2-4ac)) / (2a)
	//		The term b2-4ac is known as the determinant of a quadratic equation. It specifies the nature of roots. That is,

	//		if determinant > 0, roots are real and different
	//		if determinant == 0, roots are real and equal
	//		if determinant < 0, roots are complex complex and different

		// value a, b, and c
	    double a = 3.2, b = 4, c = 6.5;
	    double root1, root2;

	    // calculate the determinant (b2 - 4ac)
	    double determinant = b * b - 4 * a * c;

	    // check if determinant is greater than 0
	    if (determinant > 0) {

	      // two real and distinct roots
	      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

	      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	    }

	    // check if determinant is equal to 0
	    else if (determinant == 0) {

	      // two real and equal roots
	      // determinant is equal to 0
	      // so -b + 0 == -b
	      root1 = root2 = -b / (2 * a);
	      System.out.format("root1 = root2 = %.2f;", root1);
	    }

	    // if determinant is less than zero
	    else {

	      // roots are complex number and distinct
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
	      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	}

  }

}
