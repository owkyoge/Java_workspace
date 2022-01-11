package date;

import java.util.TimeZone;

public class TimeZoneExample4 {

	public static void main(String[] args) {

		TimeZone z = TimeZone.getDefault();
		 String name = z.getDisplayName();
		 
		 System.out.println("Display name for default timeZone:"+   name);
		
	}

}
