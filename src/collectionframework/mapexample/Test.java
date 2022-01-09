package collectionframework.mapexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		/**
		 * String s1 = "apple"; String s2 = "apple";
		 * 
		 * String s3 = "banana";
		 * 
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * System.out.println(s3.hashCode());
		 * 
		 * String s4 = "Aa";
		 * 
		 * String s5 = "BB";
		 * 
		 * System.out.println(s4.hashCode()); System.out.println(s5.hashCode());
		 */

		Map<String,String> hm = new HashMap<String,String>();

		hm.put("apple", "TenRupes");
		hm.put("Mango", "elevenRupees");
		hm.put("banana", "5Rupees");
		hm.put("pineapple", "twentyfiverupees");
		hm.put("sapoto", "3rupees");
		hm.put("papaya", "thirtyrupees");
		hm.put("pomegranate", "twentyrupees");
		hm.put("custordapple", "twelverupees");
		
		hm.put("apple", "TenRupesTenRupeelevenRupe"
				+ "ess");
		hm.put("Mango", "elevenRupees");
		
		hm.put("Aa", "AAAAAaaaaaaaa");
		hm.put("BB", "BBBBBBBBBB");
		hm.put(null, "AAAAAaaaaaaaa");
		
		
		
		System.out.println(hm);
		
		
	}

}
