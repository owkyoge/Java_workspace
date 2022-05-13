package date;

//Program to demonstrate getMaximum() method
//of Calendar class

import java.util.*;
public class Calendar3 {
	public static void main(String[] args)
	{
		// creating calendar object
		Calendar calendar = Calendar.getInstance();
	
		int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println("Maximum number of days in a week: " + max);

		int max1 = calendar.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Maximum number of days in a month: " + max1);
		
		int max2 = calendar.getMaximum(Calendar.WEEK_OF_MONTH);
		System.out.println("Maximum number of days in a week: " + max2);

		max = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("Maximum number of weeks in a year: " + max);
	}
}
