package instanceInitializerBlockExamples;

public class B1 extends A {

	public B1() {
		super();
		System.out.println("child class constructor invoked");
	}
	
	{
		System.out.println("Subinstance initializer block is invoked");
	}
	
	
	
	public static void main(String[] args) {

		B1 b = new B1();
	}

}
