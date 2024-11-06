// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		String input=args[0];
		int range=Integer.parseInt(input);
		int a = (int) (Math.random() * range);
		int b = (int) (Math.random() * range);
		int c = (int) (Math.random() * range);

		int max= Math.max(a, Math.max(b,c));
		int min= Math.min(a, Math.min(b,c));
		int middle = a + b + c - max - min;

		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " "+ middle +" " + max);
	}
}
