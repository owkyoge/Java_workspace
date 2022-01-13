package cloneExample;

public class Employee implements Cloneable{

	 String empName;
	 int empId;
	 int empSalary;
	
	public Employee() {
	//System.out.println("This is default Constructor");	
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
    public  Object clone() throws CloneNotSupportedException  {
    	Employee e = (Employee)super.clone();
    	return e;
    }

	
}
