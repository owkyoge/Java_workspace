package wildCards;

import java.util.Arrays;
import java.util.List;

public class LowerBounded {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1,2,3,4);
		
		printOnlyIntegerClassorSuperClass(l1);
		
		List<Number> l2 = Arrays.asList(1,2,3,4);
		
		printOnlyIntegerClassorSuperClass(l2);
		
		
	}
															// Integer extends Number  
	private static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
   
		System.out.println(list);
	}

}
