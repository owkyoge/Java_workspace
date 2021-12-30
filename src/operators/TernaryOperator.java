package operators;

public class TernaryOperator {

	public static void main(String[] args) {
      int days = 28;
      int leapYearsDays =29;
      String result;
      result = (days == leapYearsDays) ? "leap year ":"Not a leap year";
      System.out.println(result);
      
	}

}
