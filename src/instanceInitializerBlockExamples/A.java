package instanceInitializerBlockExamples;

public class A {
	
	public A() {
		System.out.println("parent class constructor invoked");
		
	}
	
	{
		System.out.println("Super instance initializer block is invoked");
	}

}
