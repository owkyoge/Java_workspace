package ioExamples;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
	
	public FileInputStreamExample(){
		
	}

	public static void main(String[] args) {

		FileInputStream fin = null;
		
		
		try {
			 fin = new FileInputStream("D:\\eswar.txt");

			int i = fin.read();

			char c = (char) i;

			System.out.println(c);

			int i1 = fin.read();

			char c1 = (char) i1;

			System.out.println(c1);

		}

		catch (Exception e) {
              e.printStackTrace();
		}
		
		finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
