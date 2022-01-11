package date;

import java.util.Calendar;

public class CalendarExample1 {

	public static void main(String[] args) {

		
		Calendar c = Calendar.getInstance();
	    System.out.println("Thae Current Date is:"+c.getTime());
	 
	    c.add(Calendar.DATE,-15);
	    System.out.println("15 Days ago:" + c.getTime());
	    
	    c.add(Calendar.MONTH, 3);
	    System.out.println("3 Months Later" + c.getTime());
	
	    c.add(Calendar.YEAR, 2);
	    System.out.println("2 Years Later" + c.getTime());
	
	}

}
