package conversion;

public class IntToLongExample2 {

	public static void main(String[] args) {

		int i = 200;
		Long l = new Long(i);
		Long l1 = Long.valueOf(i);
		
		System.out.println(l);          //    first way  
		System.out.println(l1);         //    second way  
	}

}
