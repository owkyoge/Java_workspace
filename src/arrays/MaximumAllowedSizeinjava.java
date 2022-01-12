package arrays;

public class MaximumAllowedSizeinjava {

	public static void main(String[] args) {

		int [] i = new int [2147483647];   
/* Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
	at arrays.MaximumAllowedSizeinjava.main(MaximumAllowedSizeinjava.java:7) */
		
		
		int [] t = new int [2147483648];
/* Unresolved compilation problem: 
	The literal 2147483648 of type int is out of range 		*/
		
		
	}

}
