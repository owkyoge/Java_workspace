package arrays;

public class ThreeDimensionalArray {

	public static void main(String[] args) {

		int [][][] i = {{{10,20,30},{40,50,60,}},{{70,80},{90,100,110}}};
		System.out.println(i[0][1][2]);
		System.out.println(i[1][0][1]);
		System.out.println(i[2][0][0]);  // java.lang.ArrayIndexOutOfBoundsException
  		System.out.println(i[1][2][0]);  // java.lang.ArrayIndexOutOfBoundsException
		System.out.println(i[1][1][1]);
		System.out.println(i[2][1][1]);  // java.lang.ArrayIndexOutOfBoundsException
		
	}

}
  