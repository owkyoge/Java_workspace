package typecastingExamples;

public class Tester {

	public Tester() {

	}

	public static void main(String args[]) {

		Tester t = new Tester();

		double salary = 100.28222;
		int i = (int) salary;

		System.out.println("after converting from double to int   " + i);

		float wage = 30.33f;
		int i2 = (int) wage;

		System.out.println("after converting from double to int   " + i2);

		long number = 20000000l;
		double i1 = (double) number;

		System.out.println("after converting from double to int   " + i1);

		int y = 79;
		char c = (char) y;

		System.out.println("after converting from int to char     " + c);

		int abc = 99;
		double d = (double) abc;

	}

}
