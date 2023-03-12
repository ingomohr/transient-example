package org.ingomohr.transientexample;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	private static final String PATH = System.getProperty("user.home") + "/Desktop/";
	private static final String FILE_BIN = PATH + "mydata.txt";
	private static final String FILE_XML = PATH + "mydata.xml";

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		MyData data = new MyData();
		data.myInt = 42;
		data.s = "s";
		data.ts = "ts";
		MyData.sts = "sts";

		System.out.println("Data before writing to file");
		System.out.println(" - " + data);

		ObjectIO.writeToBinaryFile(data, FILE_BIN);
		ObjectIO.writeToXMLFile(data, FILE_XML);

		System.out.println("\nData after reading back from binary file");
		MyData data2 = ObjectIO.readFromBinaryFile(FILE_BIN);
		System.out.println(" - " + data2);

		System.out.println("\nData after reading back from XML file");
		MyData data3 = ObjectIO.readFromXMLFile(FILE_XML);
		System.out.println(" - " + data3);
	}

}
