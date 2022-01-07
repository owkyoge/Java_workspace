package seriliezationExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import objectpopulateExample.Employee;

public class Deserialization {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {

			ois = new ObjectInputStream(new FileInputStream("D:\\serialization.txt"));
			Employee e = (Employee) ois.readObject();
			System.out.println(e.getName()+ "" + e.getId());

		} catch (Exception e) {
			e.fillInStackTrace();
		} finally {
			try {
				ois.close();
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
