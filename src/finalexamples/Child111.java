package finalexamples;

public class Child111 extends Parent111 {  
	
	
	@Override
	public void  m1() {
		System.out.println("This is Child Class m1 Method");
	}
	
	@Override
	public void m2() {
		System.out.println("This is Child Class m2 Method");
	
	}
	
	
   @Override
	public String m3() {
		System.out.println("Mohan");
		return "Name";
		
	}
	

	public static void main(String[] args) {
        Child111 c1 = new Child111();
        
        c1.m1();
        
        c1.m2();
		
		
	}

}
