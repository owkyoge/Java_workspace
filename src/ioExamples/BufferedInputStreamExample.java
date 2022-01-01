package ioExamples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
	
	public BufferedInputStreamExample(){
		
	}

	public static void main(String[] args) {

		FileInputStream fin = null;
		BufferedInputStream bin = null;

		try {
			fin = new FileInputStream("D:\\eswar111.txt");
			bin = new BufferedInputStream(fin);
			int read;

			while ((read = bin.read()) != -1) {
				System.out.print((char) read);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			try {
				fin.close();
				bin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
