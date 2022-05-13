package collectionframework.setexample;

import java.util.TreeSet;

public class ComparableInterface02 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();

		t.add("B");
		t.add("Z");   // "Z".compareTo("B");   +ve
		t.add("A");   // "A".compareTo("B");   -ve

		
		
		
		System.out.println(t);  //[A,B,Z]

	}
	

}
