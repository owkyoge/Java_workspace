package thisSuperkeyWords;

public class Customer {

	public String name = "Ram";
	public int age = 35;
	public long cellno = 1234567890;

	public Customer() {
		System.out.println("Default Constructor");
		System.out.println();

	}

	public Customer(String name, int age, long cellno) {
		this.name = name;
		this.age = age;
		this.cellno = cellno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getCellno() {
		return cellno;
	}

	public void setCellno(long cellno) {
		this.cellno = cellno;
	}

	public static void main(String[] args) {

		Customer c = new Customer();

		String name = c.getName();
		int age = c.getAge();
		long cellno = c.getCellno();

		System.out.println(name);
		System.out.println(age);
		System.out.println(cellno);

	}

}
