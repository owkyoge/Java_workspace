package ioExamples;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) {

		InputStream is = null;
		Reader r = null;
		try {
			is = new FileInputStream("D:\\newyear.txt");
			r = new InputStreamReader(is);
			int data = r.read();
			while (data != -1) {
				System.out.print((char) data);
				data = r.read();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
