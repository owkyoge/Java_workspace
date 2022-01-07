package collectionframework.listexample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		for (int i = 0; i <= 10; i++)
		{
			l.add(i);
		}
		System.out.println(l);
		Iterator ite = l.iterator();
		while (ite.hasNext()) {
			Integer I = (Integer) ite.next();
			if (I % 2 == 0)
				System.out.println(I);
			else
				ite.remove();
		}

		System.out.println(l);
	}

}
