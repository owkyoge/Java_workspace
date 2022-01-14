package reflectionexample;

public class TestSimple {


	public static void main(String[] args) throws Exception {

		Class c = Class.forName("reflectionexample.Simple");
		System.out.println(c.getName());
	}

}

