package inheritanceExample;

public class GrandChild2 extends Child1{
      
	@Override
	public int getProperty() {
		return 1000;
	}
	
	@Override
	public int getAge() {
		int age = 25;
	 return age;
	}
	@Override
	public String getName() {
		String name = "Marthand";
		return name;
	}
	@Override
	public double getAverageDailyWage() {
		double d = 408.78d;
		return d;
	}
	
	public static void main(String[] args) {
	
	
	GrandChild2 g2 = new GrandChild2();
	
	int property = g2.getProperty();
	int age = g2.getAge();
	String name = g2.getName();
	double d = g2.getAverageDailyWage();
	
	
	System.out.println(name);
    System.out.println(age);
    System.out.println(property);
	System.out.println(d);

}
}