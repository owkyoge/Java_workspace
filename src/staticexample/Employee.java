package staticexample;

final class Employee {

	static int id = 10;
	static String country = "INDIA";
	static String state = "ANDHRA PRADESH";
	static String distict = "KURNOOL";
	static {
		System.out.println("This is Static Block");
	}

	String village = "BPL";
	int pincode = 518124;

	public Employee() {
		System.out.println("This is default Constructor");

	}

	public int pincode() {
		return 518124;
	}

	public static String getName() {
		return "Eswar";
	}

	public static String firstname() {
		return "Yogi";
	}

	public static String fullname() {
		String s = firstname();
		return s + "Marthand";
	}

}
