package methodexample;

public class MethodOverloadingExample {
	
	  
	public int add(int a, int b) {
		int d = a+b;
		return d;
	}
	
	  
		public int add(int a, int b , int c) {
			int d = a+b+c;
			return d;
		}
	  
	
		public int add(int a, double b) {
			int d = a;
			return d;
		}
		

	public static void main(String[] args) {
             
		MethodOverloadingExample obj = new MethodOverloadingExample();
		
		int result = obj.add(27,32);
		
		int result1   = obj.add(27 , 32 , 41);
		
		int result3 = obj.add(21, 10.76d);
		
		
	    System.out.println(result);
		System.out.println(result1);
		System.out.println(result3);
		
		
	}

}
