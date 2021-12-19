package stringexample;

public class StringcontantEqualsvsequals {

	public static void main(String[] args) {
       
		String str1 = "Java";
				
		StringBuffer sb1 = new StringBuffer ("Java") ;
		
		System.out.println(str1.equals(sb1));
		 
		System.out.println(str1.contentEquals(sb1));
		
		
		
	}

}
