package date;

import java.util.Date;

public class DateExamples {

	public static void main(String[] args) {
		
		
		
   // 1St Way : 
		java.util.Date date = new java.util.Date();
		System.out.println(date);
		
		
		
  //  2nd way:
		long millis = System.currentTimeMillis();
		java.util.Date date2 = new java.util.Date(millis);
		
		System.out.println(date2);
		
		
		
		
	}

}
