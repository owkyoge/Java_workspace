package stringexample;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		String a1 = "Java";
		String a2 = "Java";
		String a3 = "Python";
		String a4 = "Python";
		
		boolean result1 = a1.equals(a2);
		System.out.println( "String a1 and a2 are equal :" + result1);
		
		boolean result2 = a1.equals(a3);
		System.out.println( "String a1 and a3 are equal :" + result2);
		
		boolean result = a3.equals(a4);
		System.out.println("String a3 & a4 r equal : " + result);
		

	
	}

}
