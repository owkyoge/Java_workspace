package conversion;

public class IntToCharExample5 {

	public static void main(String[] args) {

		int REDIX = 10;
		int a = 1;
		char c = Character.forDigit(a,REDIX);
		
		System.out.println(c);         //           redix 10 is for decimal number, for hexa use redix 16  
		
	}

}
