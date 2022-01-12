package arrays;

public class LengthVariableVSlengthMethod {

	public static void main(String[] args) {

		String [] s = {"A","AA","AAA"};
		
		System.out.println(s.length);  // 3
		
		

	//	System.out.println(s.length());
		/* Unresolved compilation problem: 
	Cannot invoke length() on the array type String[]  */ 
		
		
		
  //	System.out.println(s[0].length);      
		/* .Error: Unresolved compilation problem: 
	length cannot be resolved or is not a field  */
		

		System.out.println(s[0].length());   // 1

		
		
		
	}

}
