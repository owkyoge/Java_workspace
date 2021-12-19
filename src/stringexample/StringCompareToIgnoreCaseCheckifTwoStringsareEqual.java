package stringexample;

public class StringCompareToIgnoreCaseCheckifTwoStringsareEqual {

	public static void main(String[] args) {
      
		String str1 = "LEARN JAVA";
		String str2 = "learn java"; 
		
		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("str1 and str2 are equal");
		}
		else { 
			System.out.println("str1 and str2 are not equal");
		}
		
	}

}
