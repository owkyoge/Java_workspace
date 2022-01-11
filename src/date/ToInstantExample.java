package date;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ToInstantExample {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		// Setting the Month  
		// The months begin with 0. 0 means January  
		c.set(Calendar.MONTH,0);
		c.set(Calendar.DATE,10);
		c.set(Calendar.YEAR,2022);
		
		// with the mentioned time.  
		Date d = c.getTime();
		Instant ins = d.toInstant();
		System.out.println("The original Date is:"+d.toString());
		System.out.println("The instant is:"+ins);
	}

}
