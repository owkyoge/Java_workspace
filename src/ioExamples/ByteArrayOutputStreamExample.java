package ioExamples;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;

public class ByteArrayOutputStreamExample {

	public ByteArrayOutputStreamExample() {

	}

	public static void main(String[] args) {

		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		ByteArrayOutputStream byaos = null;

		try {
			fos1 = new FileOutputStream("D:sakshi111.txt");
			fos2 = new FileOutputStream("D:andhrajoythi222.txt");
			byaos = new ByteArrayOutputStream();

			String s = "CBI encury on Jagan. \r\n" + "Jagan will go Jail.\r\n" + "\r\n" + "Jail Jagan.\r\n"
					+ "Jail Jagan.Chandra babu not constructing Amravathi and Showing Graphics.\r\n" + "   \r\n"
					+ "Bye bye Babu.\r\n" + "   ";

			byte[] b = s.getBytes();
			byaos.write(b);
			byaos.writeTo(fos1);
			byaos.writeTo(fos2);

			byaos.flush();

		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				byaos.close();
				fos1.close();
				fos2.close();

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
