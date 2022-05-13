package collectionframework.setexample;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
	   HashSet h = new HashSet();
	   
	   h.add("D");
	   h.add("C");
	   h.add("B");
	   h.add("Z");
	   h.add(null);
	   h.add(10);
	   h.add("S");

		System.out.println(h.add("Z"));    // false
		System.out.println(h);    // [null, B, C, D, Z, 10]

		System.out.println(h.add("D"));      // false

		System.out.println(h.add("S"));
	}
	
	

}
