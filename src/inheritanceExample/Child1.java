package inheritanceExample;

public class Child1 extends Parent {

	public static void main(String[] args) {

		Child1 c1 = new Child1();

		int property = c1.getProperty();

		int age = c1.getAge();
		String name = c1.getName();
		double d = c1.getAverageDailyWage();

		
		System.out.println(name);
		System.out.println(age);
		System.out.println(property);
		System.out.println(d);
	}

}
