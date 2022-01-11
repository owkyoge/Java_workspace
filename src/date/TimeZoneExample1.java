package date;

import java.util.TimeZone;

public class TimeZoneExample1 {

	public static void main(String[] args) {

		String [] id = TimeZone.getAvailableIDs();
		System.out.println("In Time Zone class Available IDs are:");
	
		for (int i=0; i<id.length;i++) {
			System.out.println(id[i]);
		}
	
	}

}
