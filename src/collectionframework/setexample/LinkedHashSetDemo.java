package collectionframework.setexample;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		  lhs.add("D");
		  lhs.add("C");
		  lhs.add("B");
		  lhs.add("Z");
		  lhs.add(null);
		  lhs.add(10);

			System.out.println(lhs.add("Z"));    // false
			System.out.println(lhs);            // [D, C, B, Z, null, 10]

		
		
	}

}
