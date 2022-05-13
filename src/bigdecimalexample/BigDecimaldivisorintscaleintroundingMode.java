package bigdecimalexample;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimaldivisorintscaleintroundingMode {

	public static void main(String[] args) {

		BigDecimal  bg1, bg2, bg3 ;
		
		bg1 = new BigDecimal("16");
		bg2 = new BigDecimal("3");
		
		bg3 = bg1.divide(bg2, 3, RoundingMode.CEILING);
		
		System.out.println(bg3);
		
		
	}

}
