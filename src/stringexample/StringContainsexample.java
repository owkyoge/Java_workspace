package stringexample;

public class StringContainsexample {

	public static void main(String[] args) {
		
		String Str1 = " Yogi Marthand " ;
        Boolean result;
		
		result = Str1.contains("Marthand");
		 System.out.println(result);
		 
		 result = Str1.contains("Sai");
		 System.out.println(result);
		 
		 result = Str1.contains("");
		 System.out.println(result);
	}

}
