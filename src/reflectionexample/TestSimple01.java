package reflectionexample;

public class TestSimple01 {

	public void printName(Object obj) {
		Class c= obj.getClass();
		System.out.println(c.getName());
	}


	
	public static void main(String[] args) {
           Simple01 s1 = new Simple01();
           
           
           TestSimple01 t = new TestSimple01();
           t.printName(s1);
		
	}

}
