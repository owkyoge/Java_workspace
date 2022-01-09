package genericexample;

import java.util.ArrayList;
import java.util.List;

public class GenTypecastingisnotrequired {

	public static void main(String[] args) {

		List list = new ArrayList();    
		list.add("hello");    
		String s = (String) list.get(0);//typecasting  
		
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();       //    don't need to typecast
		list1.add("hello");    
		String s1 = list1.get(0);
		
		System.out.println(list1);
		
		
		
	}

}
