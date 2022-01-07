package ioExamples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class StringWriterExample {

	public static void main(String[] args) {

		char[] ary = new char[408];
		StringWriter sw = new StringWriter();
		FileInputStream input = null;
		BufferedReader buffer = null;

		try {
			input = new FileInputStream("D://newyear.txt");
			buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));
			int m;
			while ((m = buffer.read(ary)) != -1)

				sw.write(ary, 0, m);

			System.out.println(sw.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sw.close();
				input.close();
				buffer.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
