package mathClass;

public class JavaMathExample1 {

	public static void main(String[] args) {

		double x = 28;
		double y = 4;
		
		System.out.println("Maximum number of x and y :" + Math.max(x, y));
		
		System.out.println("Squra Root of y is :" + Math.sqrt(y));
		
		System.out.println("Power of x and y is:" + Math.pow(x, y));
		
        // return the logarithm of given value       
		System.out.println("Logarithm of x is:" + Math.log(x));
		System.out.println("Logarithm of y is:" + Math.log(y));
		
	     // return the logarithm of given value when base is 10      
	    System.out.println("Log10 of x is: " + Math.log10(x));  
        System.out.println("Log10 of y is: " + Math.log10(y));    
        
        // return the log of x + 1  
        System.out.println("Log1p of x is: " + Math.log1p(x));

        // return a power of 2    
        System.out.println("Exp of x is: " +Math.exp(x));    

        // return (a power of 2)-1  
        System.out.println("Expm1 of x is: " +Math.expm1(x));  

	
	}

}
