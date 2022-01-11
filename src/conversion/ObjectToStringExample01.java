package conversion;

public class ObjectToStringExample01 { // Java Object to String Example: Converting StringBuilder

	public static void main(String[] args) {

		String s = "Hello";
		
		StringBuilder sb = new StringBuilder();
		
		sb.reverse();
		String sr = sb.toString();
		System.out.println("String s: "+s);
		System.out.println("Reverse String is: " + sr);
		
	}

}
