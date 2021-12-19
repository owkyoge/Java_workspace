package stringexample;

public class StringFormatMethod {

	public static void main(String[] args) {
     String str = "Java" ;
      
     String formatstr = String.format("Language : %s" , str);
     System.out.println(formatstr);
	}

}
