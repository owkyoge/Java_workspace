package genericexample;

import java.util.ArrayList;
import java.util.List;

public class GenTypesafety {

	public static void main(String[] args) {
        
		List list = new ArrayList();    
		list.add(10);  
		list.add("10");  
		
		System.out.println(list);    //     [10, 10]

		
		List<Integer> list1 = new ArrayList<Integer>();    
		list1.add(10);  
	//	list1.add("10");// compile-time error  
			
		System.out.println(list1);   //   [10]

		
	}

}
