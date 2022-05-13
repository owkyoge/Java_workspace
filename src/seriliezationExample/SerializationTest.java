package seriliezationExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import objectpopulateExample.Employee;

public class SerializationTest {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			Employee e = new Employee("Yogi", 408 );
			fos = new FileOutputStream("D://serialization.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.flush();
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}


		}

	}

}
