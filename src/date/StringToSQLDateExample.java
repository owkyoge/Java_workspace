package date;

import java.sql.Date;

public class StringToSQLDateExample {

	public static void main(String[] args) {

		String str = "2022-01-10";
		Date date = Date.valueOf(str);

		System.out.println(date);
	}

}
