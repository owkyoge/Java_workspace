package dateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatExample {

	public static void main(String[] args) throws ParseException {

		String string = "January 22, 2010";
		DateFormat format = new SimpleDateFormat("MMMM D, yyyy", Locale.ENGLISH);
		Date date = format.parse(string);
		System.out.println(date); // Fri Jan 22 00:00:00 IST 2010

				
	
	}

}
