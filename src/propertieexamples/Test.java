package propertieexamples;

import java.io.FileReader;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws Exception {

		FileReader fr = new FileReader("D:\\Eswar\\workspace\\Java_workspace\\src\\propertieexamples\\db.properties");
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		
		
		
	}

}
