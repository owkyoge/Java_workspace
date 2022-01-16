package constructerExamples;


public class Employee {
	 
	 
	 public Employee() {
		 System.out.println("This is Default Constructor" +   "      -------->  "  +   "HELLO WORLD");
	 }
	 
	 public Employee(String name) {
		 System.out.println("Name"+ name);
	 }
	 
	 public Employee(int age) {
		 System.out.println(age);
	 }
	 
	 
	 
	 public Employee( String name ,int age) {
		 System.out.print("Virat >>>>>>");
		 System.out.println(age);
	 }
	 
	 public static void main(String[] args) {
		   
			Employee e1 = new Employee();
			new Employee("Hello");
			new Employee(50);
			new Employee( "String name" ,33);
		}


}
