package collectionframework.setexample;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTester {

	public static void main(String[] args) {

		/*
		 * Employee e1 = new Employee();
		 * 
		 * e1.setName("ABCD"); e1.setId(00); e1.setSalary(5000);
		 * 
		 * Employee e2 = new Employee();
		 * 
		 * e2.setName("EFGH"); e2.setId(11); e2.setSalary(8000);
		 * 
		 * Employee e3 = new Employee("IJKL", 33, 6000);
		 * 
		 * Employee e4 = new Employee("MNOP", 44, 9000);
		 * 
		 * Employee e5 = new Employee("QURS", 55, 3000);
		 * 
		 * 
		 * ArrayList<Employee> al = new ArrayList<>(); al.add(e1); al.add(e2);
		 * al.add(e3); al.add(e4); al.add(e5); System.out.println(al);
		 * 
		 * Collections.sort(al);
		 * 
		 * System.out.println(al);
		 */

		//

		EmployeeCMPR em1 = new EmployeeCMPR("abcd", 75, 4500);

		EmployeeCMPR em2 = new EmployeeCMPR("efgh", 30, 7500);

		EmployeeCMPR em3 = new EmployeeCMPR("ijkl", 87, 5500);

		EmployeeCMPR em4 = new EmployeeCMPR("mnop", 63, 8500);

		EmployeeCMPR em5 = new EmployeeCMPR("qurs", 20, 3500);

		ArrayList<EmployeeCMPR> l = new ArrayList<EmployeeCMPR>();
		l.add(em1);
		l.add(em2);
		l.add(em3);
		l.add(em4);
		l.add(em5);
		System.out.println(l);

		Collections.sort(l, new EmployeeCMPR());

		System.out.println(l);

		EmployeeCMPR e7 = new EmployeeCMPR() {
			@Override
			public int compare(EmployeeCMPR e1, EmployeeCMPR e2) {
				if (e1.id == e2.id)
					return 0;
				else if (e1.id > e2.id)
					return +1;
				else {
					return -1;
				}
			}
		};
		Collections.sort(l, e7 );
		System.out.println(l);


	}

}
