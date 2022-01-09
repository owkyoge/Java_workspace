package collectionframework.mapexample;

import java.util.TreeMap;

public class TreeMapDemo01 {  // Default Natural Sorting Order

	public static void main(String[] args) {

		TreeMap m = new TreeMap();
		m.put(100, "AAA");
		m.put(103, "BBB");
		m.put(101, "CCC");
		m.put(104, 106);
     //	m.put("FFF", "LLL");  //  ClassCastException (CCE)
	//	m.put(null, "MMM");  // NullPointerException  (NPE)
		System.out.println(m);

	}

}
