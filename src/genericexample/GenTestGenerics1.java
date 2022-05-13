package genericexample;

import java.util.ArrayList;
import java.util.Iterator;

public class GenTestGenerics1 {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		l.add("Mohan");
		l.add("Sai");
		l.add("Owk");

		// l.add(32); // compile time error

		String s = l.get(0);
		String s1 = l.get(1);
		String s2 = l.get(2);

		System.out.println("element is :" + s + " " + s1 + " " + s2);

		Iterator<String> itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
