package date;

import java.util.TimeZone;

public class SetIDExample {

	public static void main(String[] args) {

		TimeZone tz = TimeZone.getDefault(); 
		tz.setID("GMT + 16:29");
		System.out.println("The TimeZone Id is:" + tz.getID());
		
		
		
	}

}
