// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		String number = args[0];
		int int_number= Integer.parseInt(number);
		int ones=int_number%10;
		int_number=int_number/10;
		int tens=int_number%10;
		int_number=int_number/10;
		int hundreds=int_number%10;
		System.out.println( hundreds +" hundreds, "+ tens + " tens, " + ones + " ones.");


	}
}
