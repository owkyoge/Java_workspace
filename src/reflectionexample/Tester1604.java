package reflectionexample;

public class Tester1604 {

	public static void main(String[] args) {

		try {
			
			Class c1 = Class.forName("reflectionexample.Simple1604");
			System.out.println(c1.isInterface());
			
			Class c2 = Class.forName("reflectionexample.Simple1604.My");
			System.out.println(c2.isInterface());

		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
