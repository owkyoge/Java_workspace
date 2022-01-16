package collectionframework.setexample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo10 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(new String ("A"));
		t.add(new String ("Z"));
		t.add(new String ("K"));
		t.add(new String ("L"));
		System.out.println(t);
	}

}
 class UrComparater implements Comparator{

	public int compare(Object obj1, Object obj2) {
		
		String s1 = obj1.toString();
		
		String s2 = obj2.toString();
		
		
		return s1.compareTo(s2);
		
	}
	
}
