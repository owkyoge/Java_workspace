package collectionframework.listexample;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Balakrishna");
		l.add("Venkey");
		l.add("Chiru");
		l.add("Nag");
		System.out.println(l);                    // [Balakrishna, Venkey, Chiru, Nag]

		ListIterator itr = l.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("Venkey")) {
				itr.remove();
			} else if (s.equals("Nag")) {
				itr.add("Chaitu");
			} else if (s.equals("Chiru")) {
				itr.set("Charan");
			}
		}

		System.out.println(l);                  //[Balakrishna, Charan, Nag, Chaitu]


	}
}
