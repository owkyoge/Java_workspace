package collectionframework.listexample;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

	public String name;
	public int id;
	public int salary;

	public Employee(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args ) {

		Employee e1 = new Employee("AAAA", 10, 10000);
		Employee e2 = new Employee("BBBB", 20, 20000);
		Employee e3 = new Employee("CCCC", 30, 31000);
		Employee e4 = new Employee("DDDD", 40, 10000);
		Employee e5 = new Employee("EEEE", 50, 9000);
		Employee e6 = new Employee("FFFF", 60, 5000);
		Employee e7 = new Employee("GGGG", 70, 4500);
		Employee e8 = new Employee("HHHH", 80, 2000);
		Employee e9 = new Employee("IIII", 90, 6006);
		Employee e10 = new Employee("JJJJ", 10, 4050);

		ArrayList<Employee> l = new ArrayList<>();

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		l.add(e8);
		l.add(e9);
		l.add(e10);

		for (Employee emp : l ) {
			
		int s = emp.getSalary();
		  
		 
			
			if (s >= 10000) {
				System.out.println(s);

		}
		
		
	
		
		/*
		 * Employee emp = l.get(0); emp.getSalary();
		 * System.out.println(emp.getSalary());
		 * 
		 * Employee emp1 = l.get(1); emp1.getSalary();
		 * System.out.println(emp1.getSalary());
		 * 
		 * Employee emp2 = l.get(0); emp2.getSalary();
		 * System.out.println(emp2.getSalary());
		 */
		
		
		
		
	}

	}
}
