package genericexample;

import java.util.ArrayList;
import java.util.List;

public class GenTypecastingisnotrequired {

	public static void main(String[] args) {

		List list = new ArrayList();    
		list.add("hello");
		list.add(10);
		String s = (String) list.get(0);//typecasting  
		int i = (int) list.get(1);
		
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();       //    don't need to typecast
		list1.add("hello");   
		
		
		System.out.println(list1);
		
		
		
	}

}
