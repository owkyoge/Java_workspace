package methodexample;

public class ParametarizedMethod {
	
	public int getDays(int years ) {
		int result1 = years*365;
	 return result1 ;
	}
	
	public int getHours(int years , int days , int hours , String name) {
		int result2 = years*days*12;
	 return result2;
	}

	public static void main(String[] args) {
		
		ParametarizedMethod obj = new ParametarizedMethod();
		int result1 = obj.getDays(10);
		int result2 = obj.getHours(10 , 12 , 1, "AAAA");
		System.out.println(result1);
		System.out.println(result2);
		
	}

}
