package inheritanceExample;

public class Child2 extends Parent {
	
	
	@Override
	public int getProperty() {
	 return 100;
	}
	
	@Override
	public int getAge() {
		int age = 20;
	 return age;
	}
	
	@Override
	public String getName() {
		String name = "Sai";
		return name;
	}
	@Override
	public double getAverageDailyWage() {
		double d = 108.57d;
		return d;
	}
	
	
	public static void main(String[] args) {
		
		
	Child2 c2 = new Child2();
		
	int property = c2.getProperty(); 
    
	int age = c2.getAge();
	String name = c2.getName();
	double d = c2.getAverageDailyWage();
		
			
    System.out.println(property);
    System.out.println(age);
    System.out.println(name);
    System.out.println(d);
	}
	
	
	
	

}
