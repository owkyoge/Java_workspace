package arrays;

public class ComputeSumandAverageofArrayElements {

	public static void main(String[] args) {

		int numbers [] = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		 int arraylenght = numbers.length;

		int sum = 0;
		Double average;
		
		 for (int number : numbers) {
			 
			 sum += number;
		}
		 System.out.println("Sum = " + sum);
		 
	}

}
