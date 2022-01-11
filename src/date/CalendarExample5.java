package date;

import java.util.Calendar;

public class CalendarExample5 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		int maximum = c.getMinimum(Calendar.DAY_OF_WEEK);
		System.out.println(maximum);

		maximum = c.getMinimum(Calendar.WEEK_OF_YEAR);
		System.out.println(maximum);
		
		
		
	}

}
