package exceptionExamples;

public class Tester {

	public static void main(String[] args) {

		// case :1 
		    try {
		    
		    	System.out.println("Hello World");
		    	
		    	
		    	System.out.println("Hello BPL"   + "                     "  +  " Prepared on 09/04/2022 " ); //  on  09/04/2022

		    	
		    }
		    
		    catch (Exception e ) {
		    	e.printStackTrace();
		    }
		
		// case 2 
		    
		    try { 
		    	
		    	int a = 10;
		    	int b = 20;
		    	int c = a+b;
		    	
		    	System.out.println(c);
		    	
		    	int d = 1;
		    	int e = 0;
		    	int f = d/e;
		    	
		    }
		    
		    catch (Exception e ) {
		    	e.printStackTrace();
		    }
		    
		   // case 3 
		    
		    try {
		    	
		    	String s1 = null;
		    	String s2 = "Hello World";
		    	
		    	if (s1.equalsIgnoreCase(s2)) {
		    		System.out.println("s1 and s2 are same");
		    	}
		    	 
		    }
		
		     catch (Exception e ) {
		    	 e.printStackTrace();
		     }
		    
		    
		    
		    // case 4
		    
		    try {
		    	String fruits [] = {"Apple" , "Banana" , "Cherry" ,"Grapes" , "Mango" , "Guava"};
		    	  System.out.println(fruits[1]);
		    	  System.out.println(fruits[5]);      /// 0n 09/04/2022
		    
		    }
		    
		    
		    catch (Exception e) {
		    	e.printStackTrace();
		    }
		    
		    finally {
		    	
		    }
		    
		    
		    
		    
		    // case 5 
		     
		    try {
		    	System.out.println("Hello World");
		    	System.out.println("Banaganapalli"   + "                     "  +  " Prepared on 09/04/2022 " ); //  on  09/04/2022
		    	
		    }
		
		
		    catch (Exception e) {
		    	e.printStackTrace();
		    }
		
		  finally {
			  System.out.println("Hello World");
		    	System.out.println("Banaganapalli"   + "                     "  +  " Prepared on 09/04/2022 " ); //  on  09/04/2022

		  }
		
		
		// case 6
		    
		    try {
		    	System.out.println("ABD");
		    	System.out.println("Banaganapalli"   + "                     "  +  " Prepared on 09/04/2022 " ); //  on  09/04/2022

		    }
		
		finally {
			System.out.println("VK");
		}
		
		
	}

}
