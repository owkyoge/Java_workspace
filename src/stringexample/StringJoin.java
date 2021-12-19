package stringexample;

public class StringJoin {

	public static void main(String[] args) {
		String str1 = " I ";
		String str2 = " Love ";
		String str3 = " India ";
		 
		String joinedstr = String.join("",str1, str2, str3 );
		System.out.println(joinedstr);

	}

}
