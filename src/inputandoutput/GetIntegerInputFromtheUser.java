package inputandoutput;

import java.util.Scanner;

public class GetIntegerInputFromtheUser {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter an integer :");
	int number = input.nextInt();
	System.out.println("You entered " + number);
		
	input.close();
			
		
	}

}
