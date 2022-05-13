package bigdecimalexample;

import java.math.BigDecimal;

public class MathBigDecimalabsmethod {

	public static void main(String[] args) {

		BigDecimal bg1, bg2;
		
		bg1 = new BigDecimal(-94);
		
		System.out.println("Original Value:" + bg1);
		
		bg2 = bg1.abs();
		
        System.out.println("Abstract Value:" + bg2);
        
        
		
		
	}

}