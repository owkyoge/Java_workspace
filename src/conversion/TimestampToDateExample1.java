package conversion;

import java.sql.Timestamp;
import java.util.Date;

public class TimestampToDateExample1 {

	public static void main(String[] args) {

		  Timestamp ts=new Timestamp(System.currentTimeMillis());  
          Date date=new Date(ts.getTime());  
          System.out.println(date);
	}

}
