package importexamples;

public class Tester { 
	public static void main(String[] args) {
		
		TestOne t = new TestOne();  // creation of TestOne Object
		
		TestTwo t1 = new TestTwo(); // creation of TestTwo Object
	
		String s =  t.getTextOneMethod();  // Method calling
		
		int i = t1. getTestTwoMethod();    // Method calling
				
		System.out.println(s);
		
		System.out.println(i);

		oops.A aobj = new oops.A();  // creation of oops.A Object  
				
		
		 String s1 = aobj.getAMethod();
	       System.out.println(s1);
	
	operators.AssignmentOperators obj1 = new operators.AssignmentOperators();  // creation of operators.AssignmentOperators Object , the obj is taking from another package then we will mention package also
	
	operators.ArithmeticOperators obj2 = new operators.ArithmeticOperators();// creation of operators.ArithmeticOperators Object , the obj is taking from another package then we will mention package also
	
	
		
	
	
	}

}
