package conversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToStringExample1 {

	public static void main(String[] args) {

		Date d = Calendar.getInstance().getTime();

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		String sDate = df.format(d);
		System.out.println("Converted string:" + sDate);

	}

}
