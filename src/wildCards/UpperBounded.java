package wildCards;

import java.util.Arrays;
import java.util.List;

public class UpperBounded {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1,2,3,4);    //Upper Bounded Integer List
		
		System.out.println("Total Sum is :" + sum(l1));          //printing the sum of elements in list

		
		List<Double> l2 = Arrays.asList(1.1,2.1,3.1);             // Upper Bounded Double list

		
		System.out.println("Total Sum is :" + sum(l2));           //printing the sum of elements in list

		
		
		
		
	}                           // Integer extends Number
//							     //Double extends Number
	private static double sum(List< ? extends Number> list) {

		double sum = 0.0;
		for (Number n : list ) {
			sum+= n.doubleValue();
		}
		
		return sum;
	}

}
