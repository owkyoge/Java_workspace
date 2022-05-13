package bigdecimalexample;

import java.math.BigDecimal;

public class BigDecimaldivide {

	public static void main(String[] args) {

		BigDecimal bg1, bg2, bg3;

		bg1 = new BigDecimal("16");

		bg2 = new BigDecimal("2");

		bg3 = bg1.divide(bg2);

		String s = ("BigDecimal bg3 Value is:" + bg3);

		System.out.println(s);

	}

}
