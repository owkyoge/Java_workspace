package collectionframework.listexample;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		Vector v = new Vector();
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}

		
	//	for (Object object : v) {
		//	int i = (int)object;
		//	System.out.println(i);
		//  }
		
		
		
		
		System.out.println(v);
		Enumeration e = v.elements();
		while (e.hasMoreElements())
		{
			Integer I = (Integer) e.nextElement();
				System.out.println(I);
		}
	}

}
