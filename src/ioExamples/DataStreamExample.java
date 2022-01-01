package ioExamples;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataStreamExample {
	
	public DataStreamExample(){
		
	}

	public static void main(String[] args) {
		FileInputStream fis = null;

		DataInputStream dis = null;
		try {
			fis = new FileInputStream("D://sai.txt");

			dis = new DataInputStream(fis);

			int count = fis.available();
			byte[] ary = new byte[count];

			dis.read(ary);

			for (byte i : ary) {
				char c = (char) i;

				System.out.print(c);

			}

		}

		catch (FileNotFoundException e) {
			System.err.println("testout.txt file not available in D drive");

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				fis.close();
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
