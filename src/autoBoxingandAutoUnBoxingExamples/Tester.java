package autoBoxingandAutoUnBoxingExamples;

public class Tester {

	public static void main(String[] args) {

		int i = 10;
		double d = 100.34d;
		long l = 20000000000l;
		float f = 12.393f;
		char c = 'S';

		Integer i1 = i;
		Double d1 = d;
		Long l1 = l;
		Float f1 = f;
		Character c1 = c;

		System.out.println(i1);
		System.out.println(d1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(c1);

		System.out.println("                ");

		Integer i2 = 30;
		Double d2 = 200.09d;
		Long l2 = 300000000l;
		Float f2 = 23.83f;
		Character c2 = 'Y';

		int m = i2;
		double n = d2;
		long o = l2;
		float p = f2;
		char q = c2;

		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);

	}

}
