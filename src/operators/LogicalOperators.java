package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean b1 = (5>3)&&(8>5);
		boolean b2 = (5<3)&&(8<5);
		
	    boolean b3 = (5<3)||(8>5);
		boolean b4 = (5>3)||(8<5);
		boolean b5 = (5<3)||(8<5);
		
		boolean b6 = (!(5==3));
		boolean b7 = (!(5>3));
		
      System.out.println(b1);  
            //(OR)    in b1 Place
      System.out.println((5>3)&&(8>5));   
      System.out.println(b2);
      
      System.out.println(b3);
	  System.out.println(b4);
	  System.out.println(b5);
	  System.out.println(b6);
	  System.out.println(b7);
		
	}

}
