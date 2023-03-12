package org.ingomohr.transientexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {

	public static <T> void writeToFile(T data, String filePath) throws IOException, FileNotFoundException {
		try (FileOutputStream fOut = new FileOutputStream(filePath)) {
			try (ObjectOutputStream out = new ObjectOutputStream(fOut)) {
				out.writeObject(data);
				out.flush();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T readFromFile(String filePath)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fin = new FileInputStream(filePath)) {
			try (ObjectInputStream in = new ObjectInputStream(fin)) {
				Object obj = in.readObject();
				return (T) obj;
			}
		}
	}

}
