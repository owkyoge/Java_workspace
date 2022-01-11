package dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample2 {


	public static void main(String[] args) {

		Date d = new Date();
		System.out.println("Current Date" + d);
	    
		String dToStr = DateFormat.getInstance().format(d);
		System.out.println("DateFormat Using getInstance():" + dToStr);
		
		dToStr = DateFormat.getDateInstance().format(d);
		System.out.println("DateFormat Using getDateInstance():" +dToStr);
		
		dToStr = DateFormat.getTimeInstance().format(d);
		System.out.println("DateFormat using getTimeInstance():" + dToStr);
	
		dToStr = DateFormat.getDateTimeInstance().format(d);
		System.out.println("DateFormat using GetDateTimeInstance():" + dToStr);
		
		DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.SHORT);  // SHORT =3
		
		String format = dateInstance.format(d);
		System.out.println(format);
		
		DateFormat dateInstance2 = DateFormat.getDateInstance(2); // MEDIUM = 2
		
		String format2 = dateInstance2.format(d);
		
		System.out.println(format2);
		
		DateFormat dateTimeInstance = DateFormat.getDateInstance(DateFormat.LONG);
		
		String format3 = dateTimeInstance.format(d);
		
		System.out.println(format3);
	
	
	
	}

}
