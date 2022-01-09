package collectionframework.setexample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo12 {

	public static void main(String[] args) {

		TreeSet t = new TreeSet(new MyComparator());
		t.add("A");
		t.add(new String Buffer("ABC"));
		t.add(new String Buffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);

	}

}


public class MyComparator implements Comparator{

	public int compare(Object obj1, Object obj2) {
		
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		int l1 = s1.length();
		int l2 = s2.length();
		
		if (l1< l2)
			return -1;
		else if (l1 > l2)
			return 1;
		else
		return s1.compareTo(s2);
		
	}
	
}