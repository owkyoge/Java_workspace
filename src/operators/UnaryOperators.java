package operators;

public class UnaryOperators {

	public static void main(String[] args) {
     
		
    int a = 10;
      System.out.println(a);  // prints 10
      System.out.println(a++);   // Post increment ,   prints only 10  after the increment 
      System.out.println(a);      // Prints 11
       
      int b = 20;
      System.out.println(b);   // Prints 20 
      System.out.println(++b);   // Pre increment ,  it is increments after prints 20 
      
      
      
      
      int c = 30;
      System.out.println(c);   //  prints 30 
      System.out.println(c--);   // Post decrement  , prints only 30 after decrement 
      System.out.println(c);     // Prints 29 
      
      int d = 40;
      System.out.println(d);      // prints 40 
      System.out.println(--d);   // Pre decrement  , it is decrements after prints 39
      
	}

}