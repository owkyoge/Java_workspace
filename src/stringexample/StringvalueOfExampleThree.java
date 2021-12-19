package stringexample;

public class StringvalueOfExampleThree {

	public static void main(String[] args) {
    char ch[] = { 'p', 'r', 'o', 'g', 'r' , 'a' ,'m' };
    int offset = 2 ;
    int length = 4 ;
    
    String result;
    
    result = String.valueOf(ch, offset, length);
    System.out.println(result);
    
    
	}

}
