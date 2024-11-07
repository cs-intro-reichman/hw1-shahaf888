// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		String input=args[0];
		//we are taking the lim from the input and parse it to integer
		int range = Integer.parseInt(input);
		//take 3 random numbers from 0 to lim
		int a = (int) (Math.random() * range);
		int b = (int) (Math.random() * range);
		int c = (int) (Math.random() * range);
		//find the max, middle and min value
		int max = Math.max(a, Math.max(b,c));
		int min = Math.min(a, Math.min(b,c));
		int middle = a + b + c - max - min;

		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + middle + " " + max);
	}
}
