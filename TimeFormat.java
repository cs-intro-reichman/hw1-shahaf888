
public class TimeFormat {
	public static void main(String[] args) {
		//taking the input from the command line as array and put out the first 2 chars in string and convert to int
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		//taking the input from the command line as array and put out the last 2 chars as minutes. no need to convert
		String strMinutes = "" + args[0].charAt(3) + args[0].charAt(4); 
		String amOrPm = "";
		if (hours > 12 && hours < 24)
		{
			hours = hours - 12;
			amOrPm = "PM";

		}
		else if (hours == 24)
		{
			hours = 0;
			amOrPm = "AM";
		}
		else if (hours == 12)
		{
			amOrPm = "PM";
		}
		else
		{
			amOrPm = "AM";
		}
		System.out.println(hours + ":" + strMinutes + " " + amOrPm);
		

	}
}