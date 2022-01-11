package date;

import java.util.Calendar;

public class CalendarExample2 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println("At present Calendar's Year:" + c.get(Calendar.YEAR));
	//	System.out.println("At present Calendar's Day:"+ c.get(Calendar.MONTH)); //At present Calendar's Day:0
		System.out.println("At present Calendar's Day:"+ c.get(Calendar.DATE));
	
	}

}
