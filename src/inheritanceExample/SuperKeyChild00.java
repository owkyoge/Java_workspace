package inheritanceExample;

public class SuperKeyChild00 extends SuperKeyParent00{
	//int s =20;
	
	
	public SuperKeyChild00() {
		super();
	}


	public void m1() {
	
	//	System.out.println(super.s);
	}
	
	
	public static void main(String[] args) {
		SuperKeyChild00 sc1 = new SuperKeyChild00();
		
       // sc1.m1();
        
        System.out.println(sc1.s);
        System.out.println(sc1.a);
        System.out.println(sc1.i);
        
	}

}
