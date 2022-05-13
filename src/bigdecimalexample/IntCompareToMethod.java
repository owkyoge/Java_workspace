package bigdecimalexample;

import java.math.BigDecimal;

public class IntCompareToMethod {

	public static void main(String[] args) {

		BigDecimal bg1, bg2;
		
		bg1 = new BigDecimal("10");
		bg2 = new BigDecimal("20");
		
	int res;
		
		res = bg1.compareTo(bg2);
		
		String s1 = "Both the Values are Same";
		String s2 = "First Value is greater";
		String s3 = "Second Value is greater";
	
		
		if (res ==0) {
			System.out.println(s1);
		}
		else if (res == 1) {
			System.out.println(s2);
		}
		
		else if (res == -1) {
			System.out.println(s3);
		}
		
		
	}

}
