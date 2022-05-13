package collectionframework.listexample;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("c");
		System.out.println(s);
		System.out.println(s.search("c"));
		System.out.println(s.search("Z"));

	}

}
