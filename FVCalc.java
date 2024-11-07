// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		//taking the input from the command line
		String currentValue = args[0];
		String rate = args[1];
		String nYears = args[2];
		double newRate = Double.parseDouble(rate);
		double newNYears = Double.parseDouble(nYears);
		int newCurrentValue = Integer.parseInt(currentValue);
		//make to calculation
		double sumAfter = (newCurrentValue * Math.pow(1.0 + (newRate / 100), newNYears));
		int sumAfterConvert = (int) sumAfter;
		System.out.println("After " + nYears + " years, a $" + currentValue + " saved at " + newRate + "% will yield $" + sumAfterConvert);



	}
}