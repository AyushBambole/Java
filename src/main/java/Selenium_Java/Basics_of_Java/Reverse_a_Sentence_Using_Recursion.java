package Selenium_Java.Basics_of_Java;

public class Reverse_a_Sentence_Using_Recursion {

	public static void main(String[] args) {
		String sentence = "We had a good day today.";
	    String reversed = reverse(sentence);
	    System.out.println("The reversed sentence is: " + reversed);
	  }

	  public static String reverse(String sentence) {
	    if (sentence.isEmpty())
	      return sentence;

	    return reverse(sentence.substring(1)) + sentence.charAt(0);

	}

}
