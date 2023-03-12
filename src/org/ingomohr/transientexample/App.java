package org.ingomohr.transientexample;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {

	private static final String FILE = System.getProperty("user.home") + "/Desktop/mydata.txt";

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		MyData data = new MyData();
		data.myInt = 42;
		data.s = "s";
		data.ts = "ts";
		MyData.sts = "sts";

		System.out.println("Data before writing to file");
		System.out.println(" - " + data);

		ObjectIO.writeToFile(data, FILE);

		MyData data2 = ObjectIO.readFromFile(FILE);

		System.out.println("Data after reading back from file");
		System.out.println(" - " + data2);
	}

}
