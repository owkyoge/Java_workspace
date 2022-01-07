package objectpopulateExample;

public class EmployeeTester {

	public static void main(String[] args) {

		// Population Address

		Address a = new Address();

		a.setHouseNo(21);
		a.setStreet("Karim Bag");
		a.setVillage("Banaganapalli");
		a.setMandal("Banaganapalli");
		a.setDistic("Kurnool");
		a.setState("Andhra Pradesh");
		a.setPinCode(518124l);

		// populate Employee

		Employee e = new Employee();

		e.setId(79);
		e.setName("Yogi");
		e.setSalary(153.36d);
		e.setCellNo(1234567890l);
		e.setAddr(a);

		// Address employeeAddress = e.getAddr();
		// System.out.println("EmployeeHouseNo :" + employeeAddress.getHouseNo());

		System.out.println("EmployeeID : " + e.getId());
		System.out.println("EmployeeName : " + e.getName());
		System.out.println("EmployeeSalary : " + e.getSalary());
		System.out.println("EmployeeCellNo : " + e.getCellNo());
		System.out.println("EmployeeHouseNo : " + a.getHouseNo());
		System.out.println("EmployeeStreet  :" + a.getStreet());
		System.out.println("EmployeeVillage : " + a.getVillage());
		System.out.println("EmployeeMandal : " + a.getMandal());
		System.out.println("EmployeeDistic : " + a.getDistic());
		System.out.println("EmployeeState : " + a.getState());
		System.out.println("EmployeePinCode : " + a.getPinCode());

	}

}
