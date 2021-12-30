package operators;

public class ThisOperatorExample {

	public static void main(String[] args) {

		Employee e = new Employee();

		/*
		 * e.setName("eswar"); e.setId(100);
		 * 
		 * System.out.println(e.getName()); System.out.println(e.getId());
		 */

		
//		  Employee e1 = new Employee("sai" , 200); 
//		  System.out.println(e1.getName());
//		  System.out.println(e1.getId());
//		  
		
		Employee1 e1 = new Employee1("sai" , 200); 
		  System.out.println(e1.getName());
		  System.out.println(e1.getId());
		  
		 
	}

}
