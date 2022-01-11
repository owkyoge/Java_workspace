package conversion;

public class StringToObjectExample2ClassObj {

	public static void main(String[] args) throws   Exception {

		Class c =Class.forName("java.lang.String");
		
		System.out.println("class name: " + c.getName());
		System.out.println("Super Class Name: " + c.getSuperclass().getName());
		
	}

}
