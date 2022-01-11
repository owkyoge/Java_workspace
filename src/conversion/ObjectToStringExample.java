package conversion;

class Emp{
	
}
public class ObjectToStringExample {

	
	
	public static void main(String[] args) {

		Emp e = new Emp();
		String s = e.toString();
		String s1 = String.valueOf(e);
		System.out.println(s);
		System.out.println(s1);
	}

}
