package date;

//Program to demonstrate get() method
//of Calendar class

import java.util.*;
public class Calendar2 {
	public static void main(String[] args)
	{
		// creating Calendar object
		Calendar c = Calendar.getInstance();
		
		// Demonstrate Calendar's get()method
		System.out.println("Current Calendar's Year: " + c.get(Calendar.YEAR));
		System.out.println("Current Calendar's Day: " + c.get(Calendar.DATE));
		System.out.println("Current Hour: " + c.get(Calendar.HOUR));
		System.out.println("Current MINUTE: " + c.get(Calendar.MINUTE));
		System.out.println("Current SECOND: " + c.get(Calendar.SECOND));
		System.out.println("Current MILLISECOND: " + c.get(Calendar.MILLISECOND));
	}
}
