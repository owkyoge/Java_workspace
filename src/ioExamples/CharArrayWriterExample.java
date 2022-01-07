package ioExamples;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterExample {

	public static void main(String[] args) {
		 FileWriter fw1 = null;
		 FileWriter fw2 = null;
		 FileWriter fw3 = null;
		 FileWriter fw4 = null;
		 
		 try {
			 
			 CharArrayWriter caw = new CharArrayWriter();
			  caw.write("Hello2022!");
			   fw1 = new FileWriter("D:\\y.txt");
			   fw2 = new FileWriter("D:\\o.txt");
			 fw3 = new FileWriter("D:\\g.txt");
			  fw4 = new FileWriter("D:\\i.txt");
			  caw.writeTo(fw1);
			  caw.writeTo(fw2);
			  caw.writeTo(fw3);
			  caw.writeTo(fw4);
		 }
	   catch (Exception e) {
		    e.printStackTrace();
	   }
	   finally {
		   try {
			   fw1.close();
			   fw2.close();
			   fw3.close();
			   fw4.close();
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	   }
			
	}
	


