package collectionframework.listexample;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("Yogi");
		l.add(30);
		l.add(null);
		l.add("yogi");
		l.set(0, " Software");
		l.add(0, "Sai");
		l.removeLast();
		l.addFirst("Mohan");
		System.out.println(l);

	}

}
