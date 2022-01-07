package anonymousExamples;

public class EmployeeTester {

	public static void main(String[] args) {

		Employee e = new Employee(20, "ABD", 5000);

		System.out.println(e);
		System.out.println(e.getAddress());

		Employee e1 = new Employee() {
			@Override
			public String getAddress() {
				return "Hyderabad";
			}
		};

		System.out.println(e1.getAddress());
	}

}
