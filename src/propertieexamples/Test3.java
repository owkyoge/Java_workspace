package propertieexamples;

import java.io.FileWriter;
import java.util.Properties;

public class Test3 {

	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		p.setProperty("Name" , "Yogi Marthand");
		p.setProperty("age", "20");
		p.setProperty("Village", "Banaganapalli");
		p.setProperty("Distict", "Nandyal");
		
		
		p.setProperty("Gmail", "owkyoge@gmail.com");
		
		p.setProperty("Email", "marthand7997@gmail.com");
		
		p.setProperty("instid", "@yogi_marthand");
		
		
		
		p.store(new FileWriter("About Me(Yogi).properties"), "Yogi Marthand");

		p.store(new FileWriter("About Me.properties"), "Yogi marthand");

		
		
		// out put   in About Me(Yogi).properties
		
		
	}

}
