package bigdecimalexample;

import java.math.BigDecimal;

public class MathBigDecimaladdmethod {

	public static void main(String[] args) {

		
		BigDecimal bg1, bg2, bg3;
		
		bg1 = new BigDecimal(28.891);
		
		bg2 = new BigDecimal(67.03);
		
		bg3 = bg1.add(bg2);
		
		System.out.println(bg3);
	}
	
}
