package mathClass;

public class MethodsofMathClass {

	public static void main(String[] args) {

		double d = 00.0;
		System.out.println(Math.sqrt(d));

	    double x = 1.0/0;  
	    System.out.println(Math.sqrt(x));  
	    
	    double x1 = 0.0;  
        System.out.println(Math.cbrt(x1));  
        
        double x2 = -81.78;  
        // Input negative value, Output NaN  
        System.out.println(Math.sqrt(x2));
        
        double p = 81.0;  
        // Input positive value, Output square root of x  
        System.out.println(Math.sqrt(p)); 
		
		
	}

}
