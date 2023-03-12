package org.ingomohr.transientexample;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {

	public static <T> void writeToBinaryFile(T data, String filePath) throws IOException, FileNotFoundException {
		try (FileOutputStream fout = new FileOutputStream(filePath)) {
			try (ObjectOutputStream out = new ObjectOutputStream(fout)) {
				out.writeObject(data);
				out.flush();
			}
		}
	}

	public static <T> void writeToXMLFile(T data, String filePath) throws FileNotFoundException, IOException {
		try (FileOutputStream fout = new FileOutputStream(filePath)) {
			try (BufferedOutputStream out = new BufferedOutputStream(fout)) {
				try (XMLEncoder enc = new XMLEncoder(out)) {
					enc.writeObject(data);
				}
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T readFromBinaryFile(String filePath)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		try (FileInputStream fin = new FileInputStream(filePath)) {
			try (ObjectInputStream in = new ObjectInputStream(fin)) {
				Object obj = in.readObject();
				return (T) obj;
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T readFromXMLFile(String filePath) throws FileNotFoundException, IOException {
		try (FileInputStream fin = new FileInputStream(filePath)) {
			try (BufferedInputStream in = new BufferedInputStream(fin)) {
				try (XMLDecoder dec = new XMLDecoder(in)) {
					return (T) dec.readObject();
				}
			}
		}
	}

}
