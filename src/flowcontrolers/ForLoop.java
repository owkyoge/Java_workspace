package flowcontrolers;

public class ForLoop {

	public static void printForLoop() {
		int n = 5;
		for (int i = 1; i <= n;) {
			System.out.println("Virat" + i);
			i++;
		}
	}

	public static void yogi() {
		int n = 5;
		for (int i = 1; i <= n;) {
			System.out.println("Yogi" + i);
			i++;
		}
	}

	private static void print() {
		int sum = 0;
		int n = 100;
		for (int i = 1; i <= n; ++i) {
			sum += i;
		}
		System.out.println("Sum =" + sum);
	}

	public static void main(String[] args) {
		printForLoop();
		yogi();

//		print();  //   5050
	}

}

/*
 * public static void main(String[] args) {
 * 
 * 
 * ForLoop obj = new ForLoop(); obj.printForLoop();
 * obj.printForLoopWithNvalues();
 * 
 * }
 * 
 * }
 */
