package stringexample;

import java.util.Arrays;

public class StringSplitAtcharacter {
	public static void main(String[] args) {
     String vowels = "a+b+c";
     String [] result = vowels.split("\\+");
     
     System.out.println("result = " + Arrays.toString(result));
	
		
	}

}
