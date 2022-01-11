package date;

import java.util.TimeZone;

public class GetDefaultExample {

	public static void main(String[] args) {

		TimeZone zone = TimeZone.getDefault();

		System.out.println("The ID of Default Time Zone:" + zone.getID());

	}

}
