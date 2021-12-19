package stringexample;

public class StringformateExampleOne {

	public static void main(String[] args) {
     String language = " Java ";
     int number = 30 ; 
     String result;
     
     result = String.format(" Language : %s " , language );
     System.out.println(result);	
     
     result = String.format(" Hexadecimal : %x " , number );
     System.out.println(result);
	}

}
