package ioExamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
	
	public SequenceInputStreamExample(){
		
	}

	public static void main(String[] args) {

		FileInputStream file1 = null;
		FileInputStream file2 = null;

		try {

			file1 = new FileInputStream("D://andhrajoythi.txt");

			file2 = new FileInputStream("D://saskhi.txt");

			SequenceInputStream sis = new SequenceInputStream(file1, file2);

			int i;

			// boolean flag = ( (i = sis.read()) != -1);

			while (((i = sis.read()) != -1)) {

				char c = (char) i;

				System.out.print(c);

			}

		}

		catch (Exception exception) {

		}

		finally {

			try {
				file1.close();
				file2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
