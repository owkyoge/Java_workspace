package cloneExample;

public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e = new Employee();
		e.setEmpName("AAAA");
		e.setEmpId(18);
		e.setEmpSalary(112);
		
		System.out.println(e.getEmpName());
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpSalary());
		
		Employee e1 = (Employee) e.clone();
		
		
		System.out.println(e1.getEmpName());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpSalary());
		
	}

}
