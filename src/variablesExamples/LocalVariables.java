package variablesExamples;

public class LocalVariables {
	
	// class level variables
	int x =40;
	int y =90;

	public int age(int a ,int b ) {
		// method level variables , this scope upto method 
		int c = a+b;
		return c;
		
	}
	
	public void add() {
		
		int c = this.x + this.y;
		
		System.out.println(c);
		
	}
	
	
    public void substract()  {
    	int d = this.y - this.x;
    }
	

public static void main(String[] args) {
 
   
  
  LocalVariables v1 = new LocalVariables();
     int result = v1.age(21,31);
     v1.add();
     v1.substract();
     
     System.out.println(result);
     System.out.println(v1.x);
     System.out.println(v1.y);
   
  
	}

}
