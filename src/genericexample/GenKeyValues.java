package genericexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenKeyValues {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer,String>();
		m.put(1, "Yogi");
		m.put(2, "Sai");
		m.put(3, "AAA");
		
		
		Set<Map.Entry<Integer,String>>  s  = m.entrySet();
	
	    Iterator<Map.Entry<Integer,String>> itr = s.iterator();
		
	    
	    while(itr.hasNext()) {
	    	Map.Entry me =itr.next();
	   
	    	System.out.println(me.getKey() + " " +me.getValue());
	    	
	    }
		
		
		
		
		
		
	
	    
	    
	
	
	}

}
