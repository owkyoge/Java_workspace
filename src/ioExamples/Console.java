package ioExamples;
import java.io.*;

public class Console {

	public static void main(String[] args) {

		

		try {

			java.io.Console c= System.console();    
  
			System.out.println("Enter u r name : ");
			String n=c.readLine();    
			System.out.println("Welcome " + n);

		}

		catch (Exception e) {

			e.printStackTrace();
		}

		finally {

		}

	}

}
