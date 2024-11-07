// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // taking input from the command line and parse it to integer
		String number = args[0];
		int int_number= Integer.parseInt(number);
		//if we have negative input
		int_number=Math.abs(int_number);
		//split the number with %10 and /10
		int ones=int_number%10;
		int_number=int_number/10;
		int tens=int_number%10;
		int_number=int_number/10;
		int hundreds=int_number;
		System.out.println( hundreds +" hundreds, "+ tens + " tens, and " + ones + " ones.");


	}
}
