package stringexample;

public class StringcontentEquals {

	public static void main(String[] args) {
      String str = "Java";
      
      String str1 = "Java";
      StringBuffer sb1 = new StringBuffer("Java");
      CharSequence ch1 = "Java";
      
      String str2 = "javA";
      StringBuffer sb2 = new StringBuffer ("javA");
      CharSequence ch2  = "javA";
      
      System.out.println(str.contentEquals(str1));
      System.out.println(str.contentEquals(sb1));
      System.out.println(str.contentEquals(ch1));
      
      System.out.println(str.contentEquals(str2));
      System.out.println(str.contentEquals(sb2));
      System.out.println(str.contentEquals(ch2));
      
	}

}

s