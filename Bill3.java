// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		//we can assume that the inputs are valid - 3 names (as strings) and then number (as integer) if the bill
	    
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		String amount = args[3];
		//parsing to integer
		int argument = Integer.parseInt(amount);
		//dividing by 3.0 double
		double avg = argument / 3.0;
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + Math.ceil(avg) + " Shekels each.");

	}
}
