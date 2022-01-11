package conversion;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToTimestampExample2 {

	public static void main(String[] args) {

	     Date d = new Date();  
         Timestamp ts=new Timestamp(d.getTime());  
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
         System.out.println(sdf.format(ts));                     
		
	}

}


