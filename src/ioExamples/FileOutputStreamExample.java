package ioExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	public FileOutputStreamExample(){
		
	}

	public static void main(String[] args) {

		FileOutputStream fout = null;

		try {

			String s = "Hello World";

			byte[] name = s.getBytes();

			fout = new FileOutputStream("D:\\eswar.txt");

			fout.write(name);

		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("End of the Programm");

	}

}
