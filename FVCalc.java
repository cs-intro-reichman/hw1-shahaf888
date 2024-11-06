// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentValue = args[0];
		String rate = args[1];
		String nYears = args[2];
		double new_rate=Double.parseDouble(rate);
		double new_nYears=Double.parseDouble(nYears);
		int new_currentValue=Integer.parseInt(currentValue);
		double sum_after=(new_currentValue*Math.pow(1.0+(new_rate/100),new_nYears));
		int sum_after_convert= (int) sum_after;
		System.out.println("After "+nYears+" years, a $"+currentValue+" saved at "+new_rate+"% will yield $"+ sum_after_convert);



	}
}