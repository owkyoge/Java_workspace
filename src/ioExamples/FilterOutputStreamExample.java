package ioExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutputStreamExample {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		FilterOutputStream filter = null;

		try {
			File f = new File("D:\\sai.txt");
			fos = new FileOutputStream(f);

			filter = new FilterOutputStream(fos);
			String string = "Welcome to New Year 2022 ";
			byte b[] = string.getBytes();
			filter.write(b);
			filter.flush();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				fos.close();
				filter.close();
			}

			catch (Exception e) {

				e.printStackTrace();
			}

		}

	}

}
