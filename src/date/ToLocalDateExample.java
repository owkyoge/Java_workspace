package date;

import java.time.LocalDateTime;

public class ToLocalDateExample {

	public static void main(String[] args) {

		LocalDateTime dtm = LocalDateTime.now();
//		System.out.println(dtm); // 2022-01-10T13:34:54.003999500
		System.out.println("The Date is:" + dtm.toLocalDate());  // The Date is:2022-01-10   // The Date is:2022-04-09

	}

}
