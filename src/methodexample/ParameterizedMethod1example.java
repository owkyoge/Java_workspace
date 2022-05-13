package methodexample;

public class ParameterizedMethod1example {
	
	public int add(int a , int b) {
		int z = a+b;
		return z;
	}
	
	public int add1(int a , int b, int c) {
		int a1 = a+b+c;
		return a1;
	}
     
	public int multiply(int c , int d) {
		int y = c*d;
		return y;
	}
	
	
	
	public int substract(int e,int f) {
		int x = e-f;
		return x;
	}
	
	public int division(int g , int h ,int i) {
		int s = g/h+i;
	return s;
	}
	
	
	public static void main(String[] args) {
		
		
		ParameterizedMethod1example p1 = new ParameterizedMethod1example();
		
		
		
		int result = p1.add(1,2);
		int result1= p1.multiply(30,30);
		int result2 = p1.substract(12,6);
		int result3 = p1.division(18,3 , 3);
		int result4 = p1.add1(1,2,30);
		
		
		
		System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);     
        
	}

}
