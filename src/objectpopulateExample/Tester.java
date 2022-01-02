package objectpopulateExample;


public class Tester {

	public Tester() {

	}

	public static void main(String[] args) {

		Employee e = new Employee();

		e.setId(79);
		e.setName("Yogi");
		e.setSalary(153.36d);
		e.setCellNo(1234567890l);

		System.out.println("ID : " + e.getId());

		System.out.println("Name : " + e.getName());

		System.out.println("Salary : " + e.getSalary());

		System.out.println("CellNo : " + e.getCellNo());

		// Populate Department Object

		Department d = new Department();

		d.setDeptId(18);
		d.setDeptName("EEE");
		d.setDeptHodName("ABCDE");

		System.out.println("Department Id : " + d.getDeptId());

		System.out.println("Department Name : " + d.getDeptName());

		System.out.println("Department Hod Name : " + d.getDeptHodName());

		// Populate Adress

		Address a = new Address();

		a.setHouseNo(21);
		a.setStreet("Karim Bag");
		a.setVillage("Banaganapalli");
		a.setMandal("Banaganapalli");
		a.setDistic("Kurnool");
		a.setState("Andhra Pradesh");
		a.setPinCode(518124l);

		/*
		 * System.out.println(a.getHouseNo()); System.out.println(a.getStreet());
		 * System.out.println(a.getVillage()); System.out.println(a.getMandal());
		 * System.out.println(a.getDistic()); System.out.println(a.getState());
		 * System.out.println(a.getPinCode());
		 */

		// Populate Customer

		customer c = new customer();

		c.setCustomerId(44);
		c.setCustomerName("KING");
		c.setCustomerCellNo(6300012345l);
		c.setCustomerSex('M');
		c.setaddr(a);

		Address customeraddress = c.getaddr();

		System.out.println("CustomerId : " + c.getCustomerId());
		System.out.println("CustomerName : " + c.getCustomerName());
		System.out.println("CustomerCellNo  : " + c.getCustomerCellNo());
		System.out.println("CustomerSex  : " + c.getCustomerSex());
		System.out.println("CustomerHouseno : " + customeraddress.getHouseNo());
		System.out.println("CustomerStreet : " + customeraddress.getStreet());
		System.out.println("CustomerVillage : " + customeraddress.getVillage());
		System.out.println("CustomerMandal  : " + customeraddress.getMandal());
		System.out.println("CustomerDistic : " + customeraddress.getDistic());
		System.out.println("CustomerState : " + customeraddress.getState());
		System.out.println("CustomerPinCode : " + customeraddress.getPinCode());
	}

}
