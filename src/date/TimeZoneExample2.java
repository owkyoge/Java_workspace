package date;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExample2 {

	public static void main(String[] args) {

		TimeZone z = TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("The Offset value of time Zone is:" + z.getOffset(Calendar.ZONE_OFFSET));
		
		
	}

}
