package inheritanceExample;

public class GrandChild3 extends Child2{
	
	@Override
	public int getProperty() {
		return 10;
	}
	
	@Override
	public int getAge() {
		int age = 05;
		return age;
	}
	
	@Override
	public String getName() {
		String name = "Yogi";
		return name;
	}
	
	@Override
	public double getAverageDailyWage() {
		double d = 118.97d;
		return d;
	}	
	
	
	
	
	 public static void main(String[] args) { 
		
		 GrandChild3 g3 = new GrandChild3();
		int property = g3.getProperty();
		int age = g3.getAge();
		String name = g3.getName();
		double averageDailyWage = g3.getAverageDailyWage();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(property);
		System.out.println(averageDailyWage);
		
	}
	 

}
