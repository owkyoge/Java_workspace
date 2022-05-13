package inheritanceExample;

public class GrandChild1 extends Child1 {
	public static void main (String args []) {

  GrandChild1 g1 = new GrandChild1();
  int property = g1.getProperty();
  int age = g1.getAge();
  String name = g1.getName();
  double d = g1.getAverageDailyWage();
  
  
  
  System.out.println(name);
  System.out.println(age);
  System.out.println(property);
  System.out.println(d);
  
  
	}

}
