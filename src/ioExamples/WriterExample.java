package ioExamples;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		Writer w = null;
		try {

			 w = new FileWriter("D:\\newyear.txt");
			String content = "I Love My Mom";
			w.write(content);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
