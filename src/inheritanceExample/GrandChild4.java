package inheritanceExample;

public class GrandChild4 extends Child2{
	
	
	public static void main (String [] args) {
		
		GrandChild4 g4 = new GrandChild4();
		int property = g4.getProperty();
		int age = g4.getAge();
		String name = g4.getName();
		double d = g4.getAverageDailyWage();
		System.out.println(property);
		System.out.println(age);
		System.out.println(name);
		System.out.println(d);
	}

}
