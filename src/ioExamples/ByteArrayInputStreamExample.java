package ioExamples;

import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
	
	public ByteArrayInputStreamExample(){
		
	}

	public byte[] getNews() {

		FileInputStream fin = null;
		ByteArrayInputStream byt = null;

		String news = "";

		try {

			fin = new FileInputStream("D://andhrajoythi222.txt");
			int i;

			while (((i = fin.read()) != -1)) {
				char c = (char) i;
				// System.out.print(c);
				news = news + c;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return news.getBytes();
	}

	public static void main(String[] args) {

		ByteArrayInputStreamExample bis = new ByteArrayInputStreamExample();
		byte[] news = bis.getNews();
		ByteArrayInputStream bais = null;

		try {

			bais = new ByteArrayInputStream(news);

			int n = 0;

			while ((n = bais.read()) != -1) {
				char c = (char) n;

				System.out.print(c);
			}

		} catch (Exception e) {

		}

		finally {

		}

	}

}
