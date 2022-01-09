package collectionframework.mapexample;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo02 {   // for Customized Sorting 

	public static void main(String[] args) {

		TreeMap t = new TreeMap(new MyComparator()); 
		t.put("XXX", 10);
		t.put("AAA", 20);
		t.put("ZZZ", 30);
		t.put("LLL", 40);
		System.out.println(t);    // {ZZZ=30, XXX=10, LLL=40, AAA=20}


	}

}

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {

		String s1 = obj1.toString();
		String s2 = obj2.toString();

		return s2.compareTo(s1); // return s1.compareTo(s2);  ===== {AAA=20, LLL=40, XXX=10, ZZZ=30}

	}

}
