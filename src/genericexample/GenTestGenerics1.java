package genericexample;

import java.util.ArrayList;
import java.util.Iterator;

public class GenTestGenerics1 {

	public static void main(String[] args) {
 
		ArrayList<String> l = new ArrayList<String>();
	    l.add("Mohan");
		l.add("Sai");
	//	l.add(32);      //   compile time error
		
		String s = l.get(0);
		String s1 = l.get(1);

		
		
		System.out.println("element is :" + s + " " + s1);
		
		
		Iterator<String> itr = l.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
