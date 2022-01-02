package autoBindingExamples;

public class Tester {

	Tester() {

	}

	public static void main(String[] args) {

		// Parent p = new Parent();
		// Child c = new Child();

		/*
		 * GrandChild1 gc1 = new GrandChild1(); GrandChild2 gc2 = new GrandChild2();
		 * 
		 * String namep = p.getName(); String namec = c.getName(); String namegc1 =
		 * gc1.getName(); String namegc2 = gc2.getName();
		 * 
		 * System.out.println(namep); System.out.println(namec);
		 * System.out.println(namegc1); System.out.println(namegc2);
		 */

		// Case:1

		Parent p1 = new Child();
		p1.getName();
		System.out.println(p1.getName());

		Parent p2 = new GrandChild1();
		p2.getName();
		System.out.println(p2.getName());

		Parent p3 = new GrandChild2();
		p3.getName();
		System.out.println(p3.getName());

		// Case:2

		Child c1 = new GrandChild1();
		c1.getName();
		System.out.println(c1.getName());

		Child c2 = new GrandChild2();
		c1.getName();
		System.out.println(c2.getName());
		
		// Case:3 
		
	//	GrandChild1 gc1=  new Parent();
	//	gc1.getName();
		

	}

}
