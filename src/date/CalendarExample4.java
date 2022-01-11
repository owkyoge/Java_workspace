package date;

import java.util.Calendar;

public class CalendarExample4 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		int maximum = c.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println(maximum);
		maximum = c.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println(maximum);
		
		
	}

}
