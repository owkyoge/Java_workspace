package finalexamples.immutableObjects;

public final class Employeee {

	final String employeeeName;
	final int employeeeId;
	final double employeeeSalary;

	public Employeee(String employeeeName, int employeeeId, double employeeeSalary) {
		super();
		this.employeeeName = employeeeName;
		this.employeeeId = employeeeId;
		this.employeeeSalary = employeeeSalary;

	}

	public String getEmployeeeName() {
		return employeeeName;
	}

	public int getEmployeeeId() {
		return employeeeId;
	}

	public double getEmployeeeSalary() {
		return employeeeSalary;
	}

}
