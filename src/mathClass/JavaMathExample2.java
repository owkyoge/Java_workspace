package mathClass;

public class JavaMathExample2 {

	public static void main(String[] args) {

		double a = 30;
		
        // converting values to Radian    
		double d = Math.toRadians(a);
		
		System.out.println("Sin value of a is:" + Math.sin(a));
	
		System.out.println("Cosin of a is:" + Math.cos(a));
		
		System.out.println("Tangent of ais:"+ Math.tan(a));
		
		System.out.println("Sin of a is:" + Math.asin(a)); 
		
		System.out.println("Cosin of a is:" + Math.acos(a)); 

		System.out.println("Tangent of a is:" + Math.atan(a)); 
		
        // return the hyperbolic sine of a      
		System.out.println("Sin of a is:" + Math.sinh(a)); 

		// return the hyperbolic Cos of a      
		System.out.println("Cosin of a is:" + Math.cosh(a));

		// return the hyperbolic Tan of a      
		System.out.println("Tangent of ais:"+ Math.tanh(a));



	}

}
