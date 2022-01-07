package collectionframework.setexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeCMPR implements Comparator<EmployeeCMPR> {

	protected String name;
	protected int id;
	protected int salary;
	
	
	public EmployeeCMPR() {
		
	}

	public EmployeeCMPR(String name, int id, int salary) {

		this.name = name;
		this.id = id;
		this.salary = salary;

	}

	@Override
	public int compare(EmployeeCMPR e1, EmployeeCMPR e2) {
		if (e1.salary == e2.salary)
			return 0;
		else if (e1.salary < e2.salary)
			return +1;
		else  {
			return -1;
		}

	}

	@Override
	public String toString() {
		return "EmployeeCMPR [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}
