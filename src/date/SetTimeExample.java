package date;

import java.util.Date;

public class SetTimeExample {

	public static void main(String[] args) {


		Date d = new Date();
		System.out.println("Initial Date is:" + d);
		// setting the time for 1000000 milliseconds after  
		d.setTime(1000000);  
		// Thu Jan 01 05:46:40 IST 1970
	   // Printing the time  
		System.out.println("Date after the setting the time is:" + d);  
		
	}

}
