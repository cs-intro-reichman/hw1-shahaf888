
public class TimeFormat {
	public static void main(String[] args) {

		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		//int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); no need for the code
		String str_minutes="" + args[0].charAt(3) + args[0].charAt(4);
		String amorpm="";
		if (hours > 12 && hours <24)
		{
			hours=hours-12;
			amorpm="PM";

		}
		else if (hours == 24)
		{
			hours=0;
			amorpm="AM";
		}
		else if (hours == 12)
		{
			amorpm="PM";
		}
		else
		{
			amorpm="AM";
		}
		System.out.println(hours + ":" + str_minutes + " " + amorpm);
		

	}
}