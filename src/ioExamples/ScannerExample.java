package ioExamples;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner sin = null;
		try {
			sin = new Scanner(System.in);
			System.out.println("Enter your name:");
			String nameString = sin.nextLine();
			System.out.println("Name is :" + nameString);
		} catch (Exception e) {

		} finally {
			try {
				sin.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
