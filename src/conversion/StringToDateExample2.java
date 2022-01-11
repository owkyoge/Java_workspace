package conversion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample2 {

	public static void main(String[] args) throws Exception {

		String s1 ="10/01/2022";
		String s2 ="10-Jan-2022";
		String s3 ="10 01,2022";
		String s4 ="Mon , Jan 10 2022";
		String s5 ="Mon , Jan 10 2022 20:36:39";
		String s6 ="10-Jan-2022 20:36:39";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MM dd,yyyy");
		SimpleDateFormat sdf4 = new SimpleDateFormat("E,MMM dd yyyy");
		SimpleDateFormat sdf5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
		SimpleDateFormat sdf6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		
		Date d1 = sdf1.parse(s1);
		Date d2 = sdf2.parse(s2);
		Date d3 = sdf3.parse(s3);
	//	Date d4 = sdf4.parse(s4);  
	//	Date d5 = sdf5.parse(s5);
		Date d6 = sdf6.parse(s6);

	
		System.out.println(s1 + "\t" + d1);
		System.out.println(s2 + "\t" + d2);
		System.out.println(s3 + "\t" + d3);
	//	System.out.println(s4 + "\t" + d4);
    //  	System.out.println(s5 + "\t" + d5);
		System.out.println(s6 + "\t" + d6);
		
		
		
	}

}
