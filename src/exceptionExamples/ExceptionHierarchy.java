package exceptionExamples;

public class ExceptionHierarchy {

	public static void main(String[] args) {

		try {
		int i = 5;
		int j = 0;
		int k = i/j;
		
		System.out.println(k);
		
		}
		
		catch (ArithmeticException e) {
			
			e.printStackTrace();
		}
		
		
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		finally {
			System.out.println("This is finally Block");
		}
	}

}
