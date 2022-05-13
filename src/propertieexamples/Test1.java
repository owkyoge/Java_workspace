package propertieexamples;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) throws Exception {

//		Properties p = System.getProperties();
//		Set s = p.entrySet();

		Properties p1 = System.getProperties();
		Set s1 = p1.entrySet();
		
		Iterator i = s1.iterator();
		while (i.hasNext()) {
			Map.Entry mee = (Map.Entry) i.next();
			System.out.println(mee.getKey() + " = " + mee.getValue());
		}
		
//		Iterator itr = s.iterator();
//		while (itr.hasNext()) {
//			Map.Entry me = (Map.Entry) itr.next();
//			System.out.println(me.getKey() + " = " + me.getValue());
//		}

	}

}
