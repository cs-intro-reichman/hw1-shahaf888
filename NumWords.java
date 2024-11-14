// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // taking input from the command line and parse it to integer
		String number = args[0];
		int intNumber = Integer.parseInt(number);
		//if we have negative input
		intNumber = Math.abs(intNumber);
		//split the number with %10 and /10
		int ones = intNumber%10;
		intNumber = intNumber/10;
		int tens = intNumber%10;
		intNumber = intNumber/10;
		int hundreds = intNumber;
		System.out.println( hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");


	}
}
