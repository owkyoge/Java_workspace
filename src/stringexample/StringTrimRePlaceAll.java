package stringexample;

public class StringTrimRePlaceAll {

	public static void main(String[] args) {
      String str1 = "Learn\nJava \n\n " ;
      String result ;
       
       result = str1.replaceAll("\\s" , "");
       System.out.println(result);
	}

}
