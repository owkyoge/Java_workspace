package ioExamples;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutStreamExample {
	

	public BufferedOutStreamExample(){
		
	}
	
	public static void main(String[] args) {

		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		try {

			fout = new FileOutputStream("D:\\eswar111.txt");
			bout = new BufferedOutputStream(fout);
			String name = "Hello World.";
			byte[] b = name.getBytes();
			bout.write(b);

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				bout.flush();
				bout.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
