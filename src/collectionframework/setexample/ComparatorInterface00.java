package collectionframework.setexample;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInterface00 {

	public static void main(String[] args) {

		/*
		 * TreeSet t = new TreeSet(new MyComparator());
		 *  t.add(10);
		 *   t.add(0); 
		 *  t.add(15);
		 * t.add(20);
		 *  t.add(20); 
		 *  System.out.println(t);
		 */

		TreeSet t = new TreeSet(new MyComparator());
		t.add("Roja");
		t.add("ShobhaRani");
		t.add("Rajakumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println(t);

	}

}  

  class MyComparator implements Comparator{

	public int compare(Object o1, Object o2) {
		
		String s1 = o1.toString();
		
		String s2 = (String)o2;
		
		return s2.compareTo(s1);        //   [ShobhaRani, Roja, Ramulamma, Rajakumari, GangaBhavani]

		
	//	return -s1.compareTo(s2);    //   [ShobhaRani, Roja, Ramulamma, Rajakumari, GangaBhavani]

		
	}
	
}




