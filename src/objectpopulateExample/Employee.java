package objectpopulateExample;

import java.io.Serializable;

public class Employee implements Serializable {

	public Employee() {

	}

	

	private int id;

	private String name;

	private double salary;

	private long cellNo;

	private Address addr;
	
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getCellNo() {
		return cellNo;
	}

	public void setCellNo(long cellNo) {
		this.cellNo = cellNo;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

}
