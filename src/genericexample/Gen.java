package genericexample;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Gen {
	
	////   Type -Saftey
	

	public static void main(String[] args) {
		
		String [] s = new String [10000];
		s [0] = "Yogi";
		s [1] = "Abhi";
	//	s [2] = new Integer(10);         //   CE : error
		s [2] = "Vishnu";
		
		
	//	System.out.println(s[0]);
    // 	System.out.println(s[1]);
	//	System.out.println(s[2]);
		
		
		
		
		
		
		

/*	   ArrayList l = new ArrayList();
		l.add("Yogi");
		l.add("Sai");
		l.add(new Integer(10));
		
		String name = (String)l.get(0);
		String name1 = (String)l.get(1);
		String name2 = (String)l.get(2);         //      ClassCastException
		
	//	System.out.println(name);
	//	System.out.println(name1);        */
		
		
		
		
		

		
		
	}

}
