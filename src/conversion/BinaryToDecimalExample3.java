package conversion;

public class BinaryToDecimalExample3 {

	//     We can convert binary to decimal in java using custom logic.
	
	public static int getDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int tem = binary%10;
				decimal +=tem*Math.pow(2,n);
				binary = binary/10;
					n++;
			}
		}
		

		return  decimal;
	}

	public static void main(String[] args) {
		
		System.out.println("Decimal of 1010 is:"+getDecimal(1010));
		System.out.println("Decimal of 10101 is:"+getDecimal(10101));
		System.out.println("Decimal of 11111 is:"+getDecimal(11111));
	}

}
