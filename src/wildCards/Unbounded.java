package wildCards;

import java.util.Arrays;
import java.util.List;

public class Unbounded {

	public static void main(String[] args) {

		
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Double> l2 = Arrays.asList(1.2,2.2,3.3);
		
		
		
		
		printlist(l1);
		printlist(l2);
		
	}

	private static void printlist(List<?> list) {

		System.out.println(list);
	}

}
